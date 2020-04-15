package Week5;

public interface StackInterface<E> extends Iterable<E> {

	public void push(E element);

	public E pop();

	public boolean isEmpty();

	public E top();

	public int size();

	public void set(int i, E e);

	public E get(int i);
}
