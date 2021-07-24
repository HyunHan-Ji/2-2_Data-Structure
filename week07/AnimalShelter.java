package week07;

public class AnimalShelter {
	ListQueue<Animal> animals = new ListQueue<Animal>();

	public void enter(String name, String type) {
		animals.add(new Animal(name, type));
	}

	public void print() {
		Node node = animals.getFront();
		while (true) {
			if (animals.isEmpty())
				break;
			System.out.printf("%-6s(%s)", ((Animal) node.getItem()).getName(), ((Animal) node.getItem()).getType());
			if (node == animals.getRear())
				break;
			System.out.print(" - ");
			node = node.getNext();
		}
		System.out.println();
	}

	public void adoptAny() {
		if (animals.isEmpty()) {
			System.out.println("남아있는 동물이 없습니다.");
			return;
		}
		animals.remove();
	}

	public void adoptDog() {
		adopt("Dog");
	}

	public void adoptCat() {
		adopt("Cat");
	}

	public void adopt(String type) {
		ListQueue<Animal> temp = new ListQueue<Animal>();
		if (animals.isEmpty())
			System.out.println("남아있는 동물이 없습니다.");

		// 원하는 동물이 맨 앞에 올 때까지 동물객체를 temp에 옮김
		while (true) {
			if (animals.isEmpty()) {
				System.out.printf("남아있는 %s(이)가 없습니다.", type);
			} else if (animals.getFront().getItem().getType().equals(type)) {
				animals.remove();
				break;
			} else {
				temp.add(animals.remove());
			}
		}

		// 원하는 동물을 뺀뒤, temp에 animals에 남은 동물객체들을 넣어줌
		Node node = animals.getFront();
		while (true) {
			if (animals.isEmpty())
				break;
			temp.add(animals.remove());
			if (node == animals.getRear())
				break;
			node = node.getNext();

		}

		// temp에 animals를 대입. 즉,animals는 원하는 동물객체들 중 맨앞에 있는 동물객체를 빼고 순서가 그대로임
		animals = temp;
	}
}
