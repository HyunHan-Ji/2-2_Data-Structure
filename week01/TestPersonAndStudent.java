package week01;

public class TestPersonAndStudent {

	public static void main(String[] args) {
		PersonInfo person = new PersonInfo("������",0001);
		StudentInfo student = new StudentInfo("������",20165164,"������",0001);
		
		System.out.println("-------person.printPersonInfo() ȣ��-------");
		person.printPersonInfo();
		
		
		System.out.println("-------student.printStudentInfo() ȣ��-------");
		student.printStudentInfo();
		
	}

}