public class MainTest {
	public static void main(String[] args) {
//		SimpleLinkedList<Integer> test = new SimpleLinkedList<>();
//		test.addBot(1);
//		test.addBot(2);
//		test.addBot(3);
//		test.addBot(4);
//		test.addBot(5);
//		test.addBot(3);
//		test.remove(3);
//		for (int i = 0; i < test.size(); i++) {
//			System.out.print(test.get(i) + " ");
//		}
		SimpleArrayList<Integer> test = new SimpleArrayList<>(20);
		test.add(1);
		test.add(2);
		test.add(3);
		test.remove(3);
		for (int i = 0; i < test.size(); i++) {
			System.out.println(test.get(i) + " ");
		}
		System.out.println(test.isContain(2));
		System.out.println(test.isEmpty());
		System.out.println(test.size());
	}
}
