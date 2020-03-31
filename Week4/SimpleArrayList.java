package Week4;

import java.util.Iterator;

public class SimpleArrayList<T> implements ListInterface<T> {

	private T[] array;
	private int n = 0;
	private int defaultSize = 100;

	public SimpleArrayList() {
		// TODO Auto-generated constructor stub
		array = (T[]) new Object[defaultSize];
	}

	public SimpleArrayList(int capacity) {
		array = (T[]) new Object[capacity];
	}

	@Override
	public void add(T data) {
		// TODO Auto-generated method stub
		if (n == array.length) {
			T[] newArray = (T[]) new Object[2 * array.length];
			for (int i = 0; i < array.length; i++) {
				newArray[i] = array[i];
			}
			array = newArray;
		}
		array[n] = data;
		n++;
	}

	@Override
	public T get(int i) {
		// TODO Auto-generated method stub
		if (i < 0 || i > array.length) {
			throw new IndexOutOfBoundsException();
		}
		return array[i];
	}

	@Override
	public void set(int i, T data) {
		// TODO Auto-generated method stub
		if (i < 0 || i > array.length) {
			throw new IndexOutOfBoundsException();
		}
		for (int j = 0; j < array.length; j++) {
			if (i == j) {
				array[i] = data;
			}
		}

	}

	@Override
	public void remove(T data) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(data)) {
				array[i] = array[i + 1];
			}
		}
		n--;
	}

	@Override
	public boolean isContain(T data) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(data)) {
				return true;
			}
		}
		return false;

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return n;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size() == 0;
	}

	public Iterator<T> iterator() {
		return (Iterator<T>) new SimpleArrayList();
	}

}

