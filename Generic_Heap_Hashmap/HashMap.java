package Generic_Heap_Hashmap;


public class HashMap {
	public class Node {
		String key;
		Integer value;   //not using int because if we have no value we need to return null in get method. //and also can be converted to generic easily
		Node next;
	}

	private Node[] buk;   //buk = bucket
	private int size;

	public HashMap(int n) {
		// TODO Auto-generated constructor stub
		buk = new Node[n];
	}

	public HashMap() {
		// TODO Auto-generated constructor stub
		this(4);  //initial size = 4 (let) by default, if want to define size use ,method above
	}
 
	public void put(String key, Integer value) {
		int bn = hashfun(key);
		Node temp = buk[bn];
		while (temp != null) {
			//since map contains unique values only, toh agar exist karti h pehle se toh hum key ki value update kar deinge .
			if (temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		Node nn = new Node();
		nn.key = key;
		nn.value = value;
		nn.next = buk[bn];
		buk[bn] = nn;
		size++;
		double thf = 2.0;
		double lf = (1.0 * size) / buk.length;
		if (lf > thf) {
			rehashing();
		}
	}

	private void rehashing() {   // O(1)
		// TODO Auto-generated method stub
		Node[] newbuk = new Node[2 * buk.length];
		Node[] a = buk;
		buk = newbuk;
		size = 0;
		for (Node temp : a) {
			while (temp != null) {
				put(temp.key, temp.value);
				temp = temp.next;
			}
		}

	}

	public Integer get(String key) {
		int bn = hashfun(key);
		Node temp = buk[bn];
		while (temp != null) {
			if (temp.key.equals(key)) {

				return temp.value;
			}
			temp = temp.next;
		}
		return null;  //non primitive wrapper class so we can return null.
	}

	public boolean containsKey(String key) {
		int bn = hashfun(key);
		Node temp = buk[bn];
		while (temp != null) {
			if (temp.key.equals(key)) {

				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public Integer remove(String key) {
		int bn = hashfun(key);
		Node curr = buk[bn];
		Node prev = null;
		while (curr != null) {
			if (curr.key.equals(key)) {

				break;
			}
			prev = curr;
			curr = curr.next;
		}
		if (curr == null) {
			return null;
		}
		if (prev == null) {  //remove first ek hi element h
			buk[bn] = curr.next;
			curr.next = null;
		} else {
			prev.next = curr.next;
			curr.next = null;
		}
		size--;
		return curr.value;

	}

	public int hashfun(String key) {
		int idx = key.hashCode() % buk.length;
		if (idx < 0) {
			idx += buk.length;
		}
		return idx;
	}

	@Override
	public String toString() {
		String s="{";
		for (Node temp : buk) {
			while (temp != null) {
				s=s+ temp.key+"="+temp.value+", ";
				temp = temp.next;
			}
		}
		
		
		return s+"}";
	}

}