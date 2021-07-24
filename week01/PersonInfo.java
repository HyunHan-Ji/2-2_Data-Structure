package week01;

public class PersonInfo {

	String name;
	int ID;
	
	public PersonInfo(String name, int ID){
		this.name=name;
		this.ID=ID;
	}
	
	public void printPersonInfo(){
		System.out.printf("PersonInfo  | name : %s\tID : %d\n",this.name,this.ID);
		
	}
}

