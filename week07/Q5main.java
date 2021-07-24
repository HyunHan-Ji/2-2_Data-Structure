package week07;

public class Q5main {

	public static void main(String[] args) {
		AnimalShelter shelter=new AnimalShelter();
		shelter.enter("Brad", "Dog");
		shelter.enter("Tom", "Dog");
		shelter.enter("Cindy", "Cat");
		shelter.enter("Jake", "Dog");
		shelter.enter("Jenny", "Cat");
		shelter.enter("Alex", "Dog");
		shelter.enter("Lucy", "Cat");
		shelter.enter("Maggie", "Cat");	
		shelter.print();
		
		shelter.adoptAny();		shelter.print();	
		shelter.adoptCat();		shelter.print();
		shelter.adoptDog();		shelter.print();
		shelter.adoptAny();		shelter.print();
		shelter.adoptDog();		shelter.print();
		
	}

}
