package Week3;

import java.util.Scanner;

public class InsertSort extends Initialization {
	public static void insertSort(int[] a, int n) {
		int count = 0;
		for (int i = 1; i < n; ++i) {
			int next = a[i];
			int j;
			for (j = i - 1; j >= 0 && a[j] > next; j--) {
				a[j + 1] = a[j];
			}
			a[j + 1] = next;
			count++;
			outputArray(a, n);
		}
		System.out.println("Result: ");
		outputArray(a, n);
		System.out.println("Numbers of swap is: " +count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input length of array");
		int n = sc.nextInt();
		int[] a = new int[n];
		inputArray(a, n);
		System.out.println("The elements of the array are: ");
		outputArray(a, n);
		System.out.println("Arrangement process: ");
		insertSort(a, n);
	}
}
