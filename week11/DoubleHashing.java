package week11;

public class DoubleHashing<K, V> {
	private int N = 0, M = 13;
	private K[] a = (K[]) new Object[M];
	private V[] dt = (V[]) new Object[M];

	private int hash(K key) {
		return (key.hashCode() & 0x7fffffff) % M;
	}

	public void put(K key, V data) {
		int initailpos = hash(key);
		int i = initailpos;
		int j = 1;
		int d = (7 - (int) key % 7);
		do {
			if (a[i] == null) {
				a[i] = key;
				dt[i] = data;
				N++;
				return;
			}
			if (a[i].equals(key)) {
				dt[i] = data;
				return;
			}
			i = (initailpos + j * d) % M;
			j++;
		} while (N < M);
	}

	public V get(K key) {
		int initialpos = hash(key);
		int i = initialpos;
		int j = 1;
		int d = (7 - (int) key % 7);
		while (a[i] != null) {
			if (a[i].equals(key))
				return dt[i];
			i = (initialpos + j * d) % M;
			j++;
		}
		return null;
	}

	public void print() {
		System.out.println("해시 테이블:");
		for (int i = 0; i < M; i++) {
			System.out.print("\t" + i);
		}
		System.out.println();
		for (K temp : a)
			System.out.print("\t" + temp);
		System.out.println();
	}
}
