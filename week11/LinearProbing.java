package week11;

public class LinearProbing<K, V> {
	private int M = 13;
	private K[] a = (K[]) new Object[M];
	private V[] d = (V[]) new Object[M];

	private int hash(K key) {
		return (key.hashCode() & 0x7fffffff) % M;
	}

	public void put(K key, V data) {
		int initialpos = hash(key);
		int i = initialpos, j = 1;
		do {
			if (a[i] == null) {
				a[i] = key;
				d[i] = data;
				return;
			}
			if (a[i].equals(key)) {
				d[i] = data;
				return;
			}
			i = (initialpos + j++) % M;
		} while (i != initialpos);
	}

	public V get(K key) {
		int initialpos = hash(key);
		int i = initialpos, j = 1;
		do {
			if (a[i].equals(key))
				return d[i];
			i = (initialpos + j++) % M;
		} while (a[i] != null && i != initialpos);
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
