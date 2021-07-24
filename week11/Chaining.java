package week11;

public class Chaining<K, V> {
	private int M = 5;
	private Node[] a = new Node[M];
	private int keycount = 0; // Q7

	public static class Node {
		private Object key;
		private Object data;
		private Node next;

		public Node(Object newkey, Object newdata, Node ref) {
			key = newkey;
			data = newdata;
			next = ref;
		}

		public Object getKey() {
			return key;
		}

		public Object getData() {
			return data;
		}

	}

	private int hash(K key) {
		return (key.hashCode() & 0x7fffffff) % M;
	}

	public V get(K key) {
		rehash(keycount / M);// Q7
		int i = hash(key);
		for (Node x = a[i]; x != null; x = x.next)
			if (key.equals(x.key))
				return (V) x.data;
		return null;
	}

	public void put(K key, V data) {
		keycount++;// Q7

		int i = hash(key);
		for (Node x = a[i]; x != null; x = x.next)
			if (key.equals(x.key)) {
				x.data = data;
				return;
			}
		a[i] = new Node(key, data, a[i]);

		rehash(keycount / (double) M);// Q7
	}

	public void print() {
		System.out.println("�ؽ� ���̺�:");
		for (int i = 0; i < M; i++) {
			System.out.print(i);
			if (a[i] != null)
				NodePrint(a[i]);
			System.out.println();
		}
	}

	private void NodePrint(Node node) {
		System.out.print("-->[" + node.getKey() + "," + node.getData() + "]");
		if (node.next != null) {
			NodePrint(node.next);
		}
	}

	// Q7
	private void rehash(double alpha) {
		if (alpha == 0 || (alpha <= 0.75 && alpha >= 0.25))
			return;
		if (alpha > 0.75) {
			System.out.println("���̺��� ����� " + M + "���� " + M * 2 + "�� �����մϴ�.");
			M *= 2;
		} else if (alpha < 0.25) {
			if (M / 2 < 5) {
				return;
			}
			System.out.println("���̺��� ����� " + M + "���� " + M / 2 + "�� �����մϴ�.");
			M /= 2;
		}

		keycount = 0;
		Node temp[] = a;
		a = new Node[M];

		for (int i = 0; i < temp.length; i++) { // ���ο� ���迭�� ������ �ִ� �����͵��� ����
			if (temp[i] != null) {
				Node node = temp[i];
				while (true) {
					put2((K) node.getKey(), (V) node.getData());
					if (node.next != null) {
						node = node.next;
					} else {
						break;
					}
				}
			}
		}

	}

	private void put2(K key, V data) { // ���ο� �����͸� ������ ���, put�� ������ rehashing�� ����(rehashing�� �ϸ� �����͸� �ִµ��߿� M�� �ٽ� �۾�����
										// ���ѷ����� �߻�)
		keycount++;
		int i = hash(key);
		for (Node x = a[i]; x != null; x = x.next)
			if (key.equals(x.key)) {
				x.data = data;
				return;
			}
		a[i] = new Node(key, data, a[i]);
	}

	public void delete(K key) {
		int i = hash(key);
		for (Node x = a[i]; x != null; x = x.next)
			if (key.equals(x.key)) {
				keycount--;
				if (x.next == null) {
					a[i] = null;
					break;
				} else {
					x = x.next;
				}
			}
		rehash(keycount / (double) M);
	}

}
