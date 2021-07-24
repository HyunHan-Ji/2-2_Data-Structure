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
			System.out.println("�����ִ� ������ �����ϴ�.");
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
			System.out.println("�����ִ� ������ �����ϴ�.");

		// ���ϴ� ������ �� �տ� �� ������ ������ü�� temp�� �ű�
		while (true) {
			if (animals.isEmpty()) {
				System.out.printf("�����ִ� %s(��)�� �����ϴ�.", type);
			} else if (animals.getFront().getItem().getType().equals(type)) {
				animals.remove();
				break;
			} else {
				temp.add(animals.remove());
			}
		}

		// ���ϴ� ������ ����, temp�� animals�� ���� ������ü���� �־���
		Node node = animals.getFront();
		while (true) {
			if (animals.isEmpty())
				break;
			temp.add(animals.remove());
			if (node == animals.getRear())
				break;
			node = node.getNext();

		}

		// temp�� animals�� ����. ��,animals�� ���ϴ� ������ü�� �� �Ǿտ� �ִ� ������ü�� ���� ������ �״����
		animals = temp;
	}
}
