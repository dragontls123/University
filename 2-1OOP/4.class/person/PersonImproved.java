
/**

 File name: PersonImproved.java

 Class for a PersonImproved.

 An object of this class has two attributes, a name and an age.
 Public methods:
	Set just the name, just the age, or both.
	Test if two persons are equal (same name and age).
	Test if two persons have the same name.
	Test if two persons have the same age.
	Test if one person is older than another.
	Test if one person is younger than another.

 Preconditions:
	For set methods: the person has been created.
	For test methods: the persons have been created and have
		values for name and age.

 Postconditions:
	Set methods: one or both attributes is assigned a value.
	Test methods: true or false is returned.

 Based on: Self-Test Question #16 in Chapter 5.
*/
import java.util.*;

public class PersonImproved {
	private String name;
	private int age;

	public void readInput() {// ���� �̸� ����
		Scanner keyboard = new Scanner(System.in);
		System.out.println("what is name?");
		name = keyboard.nextLine();
		System.out.println("what is age?");
		age = keyboard.nextInt();
	}

	public void writeOutput() {// ���� �̸� ���
		System.out.println("name :" + name + " age :" + age);
	}

	public void set(String newName, int newAge) {// ���� �̸� ����
		name = newName;
		age = newAge;
	}

	public void setName(String newName) {
		name = newName;// �̸� ����

	}

	public void setAge(int newAge) {
		age = newAge;// ���� ����
	}

	public String getName() {
		return name;// �̸� ��ȯ
	}

	public int getAge() {
		return age;// ���� ��ȯ
	}

	public boolean equals(PersonImproved another) {
		return ((another.name.equals(name)) && (another.age == age));

	}

	public boolean isSameName(PersonImproved another) {
		return another.name.equals(name);

	}

	public boolean isSameAge(PersonImproved another) {
		return another.age == age;

	}

	public boolean isOlderThan(PersonImproved another) {
		return another.age < age;

	}

	public boolean isYoungerThan(PersonImproved another) {
		return another.age > age;

	}
}
