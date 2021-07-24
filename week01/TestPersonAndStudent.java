package week01;

public class TestPersonAndStudent {

	public static void main(String[] args) {
		PersonInfo person = new PersonInfo("지현한",0001);
		StudentInfo student = new StudentInfo("소융대",20165164,"지현한",0001);
		
		System.out.println("-------person.printPersonInfo() 호출-------");
		person.printPersonInfo();
		
		
		System.out.println("-------student.printStudentInfo() 호출-------");
		student.printStudentInfo();
		
	}

}