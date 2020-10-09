import java.io.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class TimetableGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			// 파일로부터 과목 정보를 가져오기 위한 변수 선언
			File file = new File("Data.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(fileReader);
			String line = "";

			// class Course 를 사용한 ArrayList - Course 를 사용하여 각 과목에 대한 데이터를 담고, 그 각각의 데이터를
			// ArrayList 를 사용하여 묶기
			ArrayList<Course> Index = new ArrayList<Course>();

			while ((line = bufReader.readLine()) != null) {
				String[] spl = line.split("\t");
				Course course = new Course(Integer.parseInt(spl[0]), spl[1].trim(), Integer.parseInt(spl[2]),
						spl[3].trim(), spl[4].trim());
				Index.add(course);
			}

			Scanner keyboard = new Scanner(System.in);

			// 최소 학점입력
			int minCre = 0;
			String input = JOptionPane.showInputDialog("Enter minimum credit : ");

			// System.out.println("Enter minimum credit : ");
			minCre = Integer.parseInt(input);
			// minCre = Integer.parseInt(keyboard.nextLine());

			System.out.println();

			// 하루 최대 수강 과목 수 입력
			int maxNum = 0;
			String input1 = JOptionPane.showInputDialog("Enter maximum number of courses to take in a day : ");

			// System.out.println("Enter maximum number of courses to take in a day : ");
			// maxNum = Integer.parseInt(keyboard.nextLine());
			maxNum = Integer.parseInt(input1);
			System.out.println();

			// 필수 과목의 중요도룰 입력받기 위한 변수 선언
			String courseInput = "";
			String importance = "";

			// 필수 과목의 이름을 담을 ArrayList mandatory
			ArrayList<String> mandatory = new ArrayList<String>();

			// 사용자가 "end"를 입력할 때까지 필수 과목의 이름과 중요도 입력받음
			while (!courseInput.equalsIgnoreCase("end")) {
				int count = 0;
				courseInput = JOptionPane.showInputDialog("Enter mandatory course name (Enter \"End\" to stop) : ");

//				System.out.println("Enter mandatory course name (Enter \"End\" to stop) : ");
//				courseInput = keyboard.nextLine();

				if (courseInput.equalsIgnoreCase("end")) {
					break;
				}

				// 모든 Course에 대하여 반복 중 입력한 과목의 이름과 같으면 출력
				for (Course c : Index) {
					if (c.getcourseName().equalsIgnoreCase(courseInput)) {
//						System.out.println(c.getcourseNum() + "\t" + c.getcourseName() + "\t" + c.getcourseCre() + "\t"
//								+ c.getcourseTime() + "\t" + c.getprofessor());
						count++;
					}
				}
				System.out.println("\n");

				// 입력한 과목 이름과 일치하는 과목이 없을 경우
				if (count == 0) {
					JOptionPane.showMessageDialog(null, "course does not exist !");
					// System.out.println("course does not exist !");
					continue;
				}
				// 입력한 과목 이름과 일치하는 과목이 있을 경우 mandatory 에 과목 이름 추가
				else {
					mandatory.add(courseInput);
				}

				// 위에서 출력한 과목을 다시 출력하며 한줄씩 중요도 입력받기
				System.out.println("Enter importance of each course (1 ~ " + count + ")");
//				JOptionPane.showMessageDialog(null, "Enter importance of each course (1 ~ " + count + ")", "타이틀 제목입니다.",
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

			// 시간표를 만들기 위한 2d array timetable 선언
			int[][] timetable = new int[10][5];

			// 시간표에 들어간 과목을 담을 ArrayList added
			ArrayList<Course> added = new ArrayList<Course>();

			// timetable 의 값을 0으로 초기화
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 5; j++) {
					timetable[i][j] = 0;
				}
			}

			// class Course 를 사용한 ArrayList - Course 를 사용하여 각 과목에 대한 데이터를 담고, 그 각각의 데이터를
			// ArrayList 를 사용하여 묶기
			ArrayList<Course> mand = new ArrayList<Course>();

			// 현재까지의 학점
			int curCre = 0;

			// 필수과목으로 입력한 과목이 있을 경우 먼저 시간표에 필수 과목을 넣음
			if (!mandatory.isEmpty()) {
				for (String man : mandatory) {
					for (Course c : Index) {
						if (man.equalsIgnoreCase(c.getcourseName())) {
							// mand 라는 ArrayList 에 필수 수강 과목으로 입력된 과목의 모든 분반을 추가
							mand.add(c);
						}
					}
				}
			}

			// 필수 수강 과목이 순서 없이 넣어진 mand 라는 ArrayList 를 정렬
			Collections.sort(mand);

			/*
			 * // 필수 수강 과목 출력 for(Course c : mand) { System.out.println(c.getcourseNum() +
			 * "\t" + c.getcourseName() + "\t" + c.getcourseCre() + "\t" + c.getcourseTime()
			 * + "\t" + c.getprofessor() + "\t" + c.getimportance()); }
			 */

			// 필수 수강 과목 먼저 시간표에 넣기
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
			// 시간표에 들어갈 수 있는 과목들을 담아둘 ArrayList addable
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
				// 들어갈 수 있는 경우에 addable 에 추가한 뒤 cmp 라는 공강 시간 입력하기

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

			// 필수 수강 과목을 채운 후 다른 과목 채우기
			for (Course c : addable) {
				int same = 0;

				if (curCre >= minCre) {
					break;
				}

				// 이미 과목이 추가되어있으면 continue
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

				// 여기부터 수정할 부분
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

			// 출력

			for (Course s : added) {
				System.out.println(s.getcourseNum() + "\t" + s.getcourseName());
			}
			System.out.println();

			// 학수번호로 나타낸 시간표 (과목 안채워진 경우 0)
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
			// 이름으로 시간표 출력
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