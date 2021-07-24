package week01;

public class StudentInfo extends PersonInfo {

	String deptName;
	int stuID;
	
	public StudentInfo(String deptName, int stuID,String name,int ID){
		super(name,ID);
		this.deptName=deptName;
		this.stuID=stuID;
	}
	
	public void printStudentInfo(){
		super.printPersonInfo();
		System.out.printf("StudentInfo | deptName : %s\tID :%d",this.deptName,this.stuID);
	}

}