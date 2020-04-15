package Week5;

import java.util.Iterator;

public class ArrayListStack<E> implements StackInterface<E> {
	private E[] data;
	private int top = -1;
	private static final int CAPACITY = 1000;

	public ArrayListStack() {
		this(CAPACITY);
	}

	public ArrayListStack(int capacity) {
		// TODO Auto-generated constructor stub
		data = (E[]) new Object[capacity];
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new ArrayStackIterator();
	}

	@Override
	public void push(E element) {
		// TODO Auto-generated method stub
		if (size() == data.length) {
			throw new IllegalStateException("Stack is full");
		} else {
			data[++top] = element;
		}

	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		if (isEmpty() == true) {
			return null;
		} else {
			E temp = data[top--];
			return temp;
		}
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == -1;
	}

	@Override
	public E top() {
		// TODO Auto-generated method stub
		if (isEmpty() == true) {
			return null;
		}
		return data[top];
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return top + 1;
	}

	class ArrayStackIterator implements Iterator<E> {
		private int num = 0;
		private int current = top;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return num < top + 1;
		}

		@Override
		public E next() {
			// TODO Auto-generated method stub
			E e = data[(current+1 + num) % size()];
			num++;
			return e;
		}

	}

	public static void main(String[] args) {
		ArrayListStack<Integer> stack = new ArrayListStack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.pop();
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.pop();
		System.out.println("Top = " + stack.top());
		System.out.println("Size of stack = " + stack.size());
		stack.set(1, 3);
		System.out.println("The current listing is: ");
		for (Integer i : stack) {
			System.out.print(i + " ");
		}
	}

	@Override
	public void set(int i, E e) {
		// TODO Auto-generated method stub
		if (i < 0 || i > data.length) {
			throw new IndexOutOfBoundsException();
		}
		for (int j = 0; j < data.length; j++) {
			if (i == j) {
				data[i] = e;
			}
		}
	}

	@Override
	public E get(int i) {
		// TODO Auto-generated method stub
		if (i < 0 || i > data.length) {
			throw new IndexOutOfBoundsException();
		}
		return data[i];
	}
}
