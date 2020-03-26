package Week3;

import java.util.Scanner;

public class SelectSort extends Initialization {
	public static void selectSort(int a[], int n) {
		int count = 0 ;
		for (int i = n-1; i >= 1; --i) {
			int maxIdx = i;
			//tim phan tu lon nhat
			for (int j = 0; j < i; ++j) {
				if (a[j] >= a[maxIdx]) {
					maxIdx = j;
				}
			}
			//doi cho phân tu lon nhat vs phan tu cuoi 
			int temp = a[maxIdx];
			a[maxIdx] = a[i];
			a[i] = temp;
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
		selectSort(a, n);
	}
}
