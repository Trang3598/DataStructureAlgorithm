package Week3;

import java.util.Scanner;

public class BubbleSort extends Initialization {

	public static void bubbleSort(int a[], int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					count++;
				}
			}
			System.out.println("Swap " + i + " times");
			outputArray(a, n);

		}
		System.out.println("Result: ");
		outputArray(a, n);
		System.out.println("Numbers of swap is: " + count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input length of array");
		int n = sc.nextInt();
		int[] a = new int[n];
		inputArray(a, n);
		System.out.println("The elements of the array are: ");
		outputArray(a, n);
		bubbleSort(a, n);
		System.out.println(System.nanoTime());
	}
}
