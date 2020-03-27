package Week4;

public class SimpleLinkedList<T> {

	class Node {
		T data;
		Node next;
	}

	private Node top = null;
	private Node bot = null;
	private int n = 0;

	public void add(T data) {
		// Them phan tu vao dau danh sach
		Node node = new Node();
		node.data = data;
		if (top == null) {
			top = node;
		} else {
			node.next = top;
			top = node;
		}
		n++;
	}

	public void addBot(T data) {
		Node node = new Node();
		node.data = data;
		if (top == null) {
			top = node;
		} else {
			Node q = top;
			while (q.next != null)
				q = q.next;
			q.next = node;
		}
		n++;
	}

	public T get(int i) {
		Node q = top;
		try {
			for (int j = 0; j < i; j++) {
				q = q.next;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return q.data;
	}

	public void set(int i, T data) {

		try {
			Node q = top;
			for (int j = 0; j < i; j++) {
				q = q.next;
			}
			q.data = data;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean isContain(T data) {
		Node q = top;
		while (q.next != null) {
			if (q.data.equals(data)) {
				return true;
			}
			q = q.next;
		}
		return false;
	}

	public int size() {
		return n;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public T removeTop() {
		if (top == null) {
			System.out.println("No data to remove");
		} else {
			top = top.next;
		}
		n--;
		return top.data;
	}

	public T removeBot() {
		Node q = top;
		while (q.next != null) {
			q = q.next;
		}
		q.next = null;
		n--;
		return top.data;
	}

	public void remove(T data) {
		Node q = top;
		for (Node i = top; i != null; i = i.next) {
			if (i.next.data.equals(data)) {
				i.next = i.next.next;
				n--;
			}
		}
	}

	public int indexOf(T data) {
		// TODO Auto-generated method stub
		Node q = top;
		for (int i = 0; i < size(); i++) {
			if (q.data.equals(data)) {
				return i;
			}
			q = q.next;
		}
		return -1;
	}

}
