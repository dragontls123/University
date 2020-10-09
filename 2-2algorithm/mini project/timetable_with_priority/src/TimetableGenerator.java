import java.io.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class TimetableGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			// ���Ϸκ��� ���� ������ �������� ���� ���� ����
			File file = new File("Data.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(fileReader);
			String line = "";

			// class Course �� ����� ArrayList - Course �� ����Ͽ� �� ���� ���� �����͸� ���, �� ������ �����͸�
			// ArrayList �� ����Ͽ� ����
			ArrayList<Course> Index = new ArrayList<Course>();

			while ((line = bufReader.readLine()) != null) {
				String[] spl = line.split("\t");
				Course course = new Course(Integer.parseInt(spl[0]), spl[1].trim(), Integer.parseInt(spl[2]),
						spl[3].trim(), spl[4].trim());
				Index.add(course);
			}

			Scanner keyboard = new Scanner(System.in);

			// �ּ� �����Է�
			int minCre = 0;
			String input = JOptionPane.showInputDialog("Enter minimum credit : ");

			// System.out.println("Enter minimum credit : ");
			minCre = Integer.parseInt(input);
			// minCre = Integer.parseInt(keyboard.nextLine());

			System.out.println();

			// �Ϸ� �ִ� ���� ���� �� �Է�
			int maxNum = 0;
			String input1 = JOptionPane.showInputDialog("Enter maximum number of courses to take in a day : ");

			// System.out.println("Enter maximum number of courses to take in a day : ");
			// maxNum = Integer.parseInt(keyboard.nextLine());
			maxNum = Integer.parseInt(input1);
			System.out.println();

			// �ʼ� ������ �߿䵵�� �Է¹ޱ� ���� ���� ����
			String courseInput = "";
			String importance = "";

			// �ʼ� ������ �̸��� ���� ArrayList mandatory
			ArrayList<String> mandatory = new ArrayList<String>();

			// ����ڰ� "end"�� �Է��� ������ �ʼ� ������ �̸��� �߿䵵 �Է¹���
			while (!courseInput.equalsIgnoreCase("end")) {
				int count = 0;
				courseInput = JOptionPane.showInputDialog("Enter mandatory course name (Enter \"End\" to stop) : ");

//				System.out.println("Enter mandatory course name (Enter \"End\" to stop) : ");
//				courseInput = keyboard.nextLine();

				if (courseInput.equalsIgnoreCase("end")) {
					break;
				}

				// ��� Course�� ���Ͽ� �ݺ� �� �Է��� ������ �̸��� ������ ���
				for (Course c : Index) {
					if (c.getcourseName().equalsIgnoreCase(courseInput)) {
//						System.out.println(c.getcourseNum() + "\t" + c.getcourseName() + "\t" + c.getcourseCre() + "\t"
//								+ c.getcourseTime() + "\t" + c.getprofessor());
						count++;
					}
				}
				System.out.println("\n");

				// �Է��� ���� �̸��� ��ġ�ϴ� ������ ���� ���
				if (count == 0) {
					JOptionPane.showMessageDialog(null, "course does not exist !");
					// System.out.println("course does not exist !");
					continue;
				}
				// �Է��� ���� �̸��� ��ġ�ϴ� ������ ���� ��� mandatory �� ���� �̸� �߰�
				else {
					mandatory.add(courseInput);
				}

				// ������ ����� ������ �ٽ� ����ϸ� ���پ� �߿䵵 �Է¹ޱ�
				System.out.println("Enter importance of each course (1 ~ " + count + ")");
//				JOptionPane.showMessageDialog(null, "Enter importance of each course (1 ~ " + count + ")", "Ÿ��Ʋ �����Դϴ�.",
//						1);
				for (Course c : Index) {

					if (c.getcourseName().equalsIgnoreCase(courseInput)) {
						// System.out.print(c.getcourseNum() + "\t" + c.getcourseName() + "\t" +
						// c.getcourseCre() + "\t"
//								+ c.getcourseTime() + "\t" + c.getprofessor() + "\t - ");
						String[] buttons = { "1", "2", "3", "4", "5" };
						int num = JOptionPane.showOptionDialog(null,
								c.getcourseNum() + "\n" + c.getcourseName() + "\n" + c.getcourseCre() + "\n"
										+ c.getcourseTime() + "\n" + c.getprofessor(),
								" Enter importance of each course (1 ~ " + count + ")",
								JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, buttons, "2");

//						importance = JOptionPane.showInputDialog(c.getcourseNum() + "\t" + c.getcourseName() + "\t"
//								+ c.getcourseCre() + "\t" + c.getcourseTime() + "\t" + c.getprofessor() + "\t - ");
						// importance = keyboard.nextLine();
						// c.setimportance(Integer.parseInt(importance));
						c.setimportance(num);
					}
				}
				System.out.println("\n");
			}

			// �ð�ǥ�� ����� ���� 2d array timetable ����
			int[][] timetable = new int[10][5];

			// �ð�ǥ�� �� ������ ���� ArrayList added
			ArrayList<Course> added = new ArrayList<Course>();

			// timetable �� ���� 0���� �ʱ�ȭ
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 5; j++) {
					timetable[i][j] = 0;
				}
			}

			// class Course �� ����� ArrayList - Course �� ����Ͽ� �� ���� ���� �����͸� ���, �� ������ �����͸�
			// ArrayList �� ����Ͽ� ����
			ArrayList<Course> mand = new ArrayList<Course>();

			// ��������� ����
			int curCre = 0;

			// �ʼ��������� �Է��� ������ ���� ��� ���� �ð�ǥ�� �ʼ� ������ ����
			if (!mandatory.isEmpty()) {
				for (String man : mandatory) {
					for (Course c : Index) {
						if (man.equalsIgnoreCase(c.getcourseName())) {
							// mand ��� ArrayList �� �ʼ� ���� �������� �Էµ� ������ ��� �й��� �߰�
							mand.add(c);
						}
					}
				}
			}

			// �ʼ� ���� ������ ���� ���� �־��� mand ��� ArrayList �� ����
			Collections.sort(mand);

			/*
			 * // �ʼ� ���� ���� ��� for(Course c : mand) { System.out.println(c.getcourseNum() +
			 * "\t" + c.getcourseName() + "\t" + c.getcourseCre() + "\t" + c.getcourseTime()
			 * + "\t" + c.getprofessor() + "\t" + c.getimportance()); }
			 */

			// �ʼ� ���� ���� ���� �ð�ǥ�� �ֱ�
			for (Course c : mand) {
				int same = 0;
				for (Course a : added) {
					if (c.getcourseName().equalsIgnoreCase(a.getcourseName())) {
						same++;
					}
				}
				if (same != 0) {
					continue;
				}

				int emp = 0;
				ArrayList<int[]> temp = new ArrayList<int[]>();
				c.timeTranslator();
				temp = c.gettrans();
				for (int[] tmp : temp) {
					if (timetable[tmp[0]][tmp[1]] != 0) {
						emp++;
					}
				}

				if (emp == 0) {
					added.add(c);
					curCre = curCre + c.getcourseCre();

					for (int[] tmp : temp) {
						timetable[tmp[0]][tmp[1]] = c.getcourseNum();
					}
				}
			}

			//////
			// �ð�ǥ�� �� �� �ִ� ������� ��Ƶ� ArrayList addable
			ArrayList<Course> addable = new ArrayList<Course>();

			for (Course c : Index) {
				int emp = 0;
				ArrayList<int[]> temp = new ArrayList<int[]>();
				c.timeTranslator();
				temp = c.gettrans();

				for (int[] tmp : temp) {
					if (timetable[tmp[0]][tmp[1]] != 0) {
						emp++;
					}
				}

				////////////
				// �� �� �ִ� ��쿡 addable �� �߰��� �� cmp ��� ���� �ð� �Է��ϱ�

				int top = 0;
				int bottom = 0;
				if (emp == 0) {
					addable.add(c);
					int count = 0;

					for (int[] tmp : temp) {
						for (int i = 1; tmp[0] + i < 10; i++) {
							if (timetable[tmp[0] + i][tmp[1]] != 0) {
								break;
							} else {
								bottom++;
							}
						}

						for (int i = 1; tmp[0] - i > 0; i++) {
							if (timetable[tmp[0] - i][tmp[1]] != 0) {
								break;
							} else {
								top++;
							}
						}

						if ((tmp[0] == 0) && (top != 0)) {
							c.settop(top + 2);
						} else if ((tmp[0] == 9) && (bottom != 0)) {
							c.setbottom(bottom + 2);
						} else if (count == 0) {
							c.settop(top);
							c.setbottom(bottom);
						} else {
							c.settop(Math.min(c.gettop(), top));
							c.setbottom(Math.min(c.getbottom(), bottom));
						}
						count++;
					}
					c.setcmp(c.getbottom() + c.gettop());

					int bef = 0;
					int aft = 0;
					int same_day = 0;

					for (int[] tmp : temp) {
						for (int i = 1; tmp[0] + i < 10; i++) {
							if (timetable[tmp[0] + i][tmp[1]] != 0) {
								aft++;
								break;
							}
						}

						for (int i = 1; tmp[0] - i > 0; i++) {
							if (timetable[tmp[0] - i][tmp[1]] != 0) {
								bef++;
								break;
							}
						}

						if ((aft > 0) && (bef > 0)) {
							same_day++;
						}
					}

					if (!((aft > 1) && (bef > 1) && (same_day == count))) {
						c.setcmp(c.getcmp() * 10);
					}
				}
			}
			////////////

			Collections.sort(addable);

			/*
			 * for(Course c : addable) { System.out.println(c.getcourseNum() + "\t" +
			 * c.getcourseName() + "\t" + c.getcourseCre() + "\t" + c.getcourseTime() + "\t"
			 * + c.getprofessor() + "\t" + c.getcmp()); }
			 */
			//////

			// �ʼ� ���� ������ ä�� �� �ٸ� ���� ä���
			for (Course c : addable) {
				int same = 0;

				if (curCre >= minCre) {
					break;
				}

				// �̹� ������ �߰��Ǿ������� continue
				for (Course a : added) {
					if ((a.getcourseName().equalsIgnoreCase(c.getcourseName()))
							|| ((c.getcourseName().matches("(.*)Practical English(.*)"))
									&& (a.getcourseName().matches("(.*)Practical English(.*)")))
							|| ((c.getcourseName().matches("(.*)Speaking Practice(.*)"))
									&& (a.getcourseName().matches("(.*)Speaking Practice(.*)")))) {
						same++;
					}
				}
				if (same != 0) {
					continue;
				}

				// ������� ������ �κ�
				int emp = 0;
				ArrayList<int[]> temp = new ArrayList<int[]>();
				c.timeTranslator();
				temp = c.gettrans();

				ArrayList<Integer> day = new ArrayList<>();

				for (int[] tmp : temp) {
					for (int i = 0; i < 10; i++) {
						if (timetable[i][tmp[1]] != 0) {
							if (day.contains(timetable[i][tmp[1]]) == true) {
								continue;
							}
							day.add(timetable[i][tmp[1]]);
						}
					}
				}

				if (day.size() + 1 > maxNum) {
					continue;
				}

				for (int[] tmp : temp) {
					if (timetable[tmp[0]][tmp[1]] != 0) {
						emp++;
					}
				}

				if (emp == 0) {
					added.add(c);
					curCre = curCre + c.getcourseCre();

					for (int[] tmp : temp) {
						timetable[tmp[0]][tmp[1]] = c.getcourseNum();
					}
				}
			}

			// ���

			for (Course s : added) {
				System.out.println(s.getcourseNum() + "\t" + s.getcourseName());
			}
			System.out.println();

			// �м���ȣ�� ��Ÿ�� �ð�ǥ (���� ��ä���� ��� 0)
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 5; j++) {

					System.out.print(timetable[i][j] + "\t");
				}
				System.out.println();
			}
			String header[][] = { { " ", " ", " ", " ", " " }, { " ", " ", " ", " ", " " }, { " ", " ", " ", " ", " " },
					{ " ", " ", " ", " ", " " }, { " ", " ", " ", " ", " " }, { " ", " ", " ", " ", " " },
					{ " ", " ", " ", " ", " " }, { " ", " ", " ", " ", " " }, { " ", " ", " ", " ", " " },
					{ " ", " ", " ", " ", " " }, { " ", " ", " ", " ", " " }, };
			String content[] = { "mon", "tue", "wed", "thur", "fri" };
			Dimension dim = new Dimension(11400, 11400);
			JFrame frame = new JFrame("timetable");
			frame.setLocation(400, 400);
			JTable table = new JTable(header, content);
			JScrollPane scrollpane = new JScrollPane(table);
			frame.add(scrollpane);
			frame.pack();
			frame.setVisible(true);
			// �̸����� �ð�ǥ ���
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 5; j++) {
					for (Course c : Index) {
						if (timetable[i][j] == c.getcourseNum()) {
							// System.out.print(c.getcourseName());
							table.setValueAt(c.getcourseName() + "/" + c.getcourseNum() + "/" + c.getprofessor(), i, j);
						}
					}
					System.out.print("\t");
				}
				System.out.println();

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}