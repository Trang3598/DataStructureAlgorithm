import java.util.Scanner;

public class Array {
	public static Scanner sc = new Scanner(System.in);

	public static void input() {
		int n;
		do {
			System.out.println("Input length of array");
			n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++) {
				System.out.println("Enter the element has index at " + i);
				a[i] = sc.nextInt();
			}
			output(a);
			sort(a);
			int index;
			do {
				System.out.println("Enter the location of the element to find");
				index = sc.nextInt();
				search(index, a);
			} while (index != 0);
		} while (n != 0);
	}

	public static void output(int[] a) {
		System.out.println("Input array is: ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + "\t");
		}
	}

	public static void sort(int[] a) {
		System.out.println("Sort array is : ");
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print("a" + "[" + i + "]" + "=" + "\t");
			System.out.println(a[i]);
		}
	}

	public static void search(int index, int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (index == i) {
				System.out.println("Value: " + a[i]);
			}
		}
	}

	public static void main(String[] args) {
		input();
	}
}
