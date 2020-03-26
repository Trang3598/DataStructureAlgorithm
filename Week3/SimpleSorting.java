package Week3;

import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class SimpleSorting<T> {
	public static <T> void bubbleSort(Comparable<T>[] a, int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i].compareTo((T) a[j]) > 0) {
					Comparable<T> temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					count++;
				}
			}
		}
		System.out.println("Numbers of swap is: " + count);
	}

	public static <T> void insertSort(Comparable<T>[] a, int n) {
		int count = 0;
		for (int i = 1; i < n; ++i) {
			Comparable<T> next = a[i];
			int j;
			for (j = i - 1; j >= 0 && a[j].compareTo((T) next) > 0; j--) {
				a[j + 1] = a[j];

			}
			a[j + 1] = next;
			count++;
		}
		System.out.println("Numbers of swap is: " + count);
	}

	public static <T> void selectSort(Comparable<T>[] a, int n) {
		int count = 0;
		for (int i = n - 1; i >= 1; --i) {
			int maxIdx = i;
			// tim phan tu lon nhat
			for (int j = 0; j < i; ++j) {
				if (a[j].compareTo((T) a[maxIdx]) >= 0) {
					maxIdx = j;
				}
			}
			// doi cho phân tu lon nhat vs phan tu cuoi
			Comparable<T> temp = a[maxIdx];
			a[maxIdx] = a[i];
			a[i] = temp;
			count++;
		}
		System.out.println("Numbers of swap is: " + count);
	}

	public static void main(String[] args) {

		Integer[] a = { 1, 5, 2, 7, 3, 9, 10 };
		int n = a.length;
		System.out.println("Sorted Array: ");
//		bubbleSort(a, n);  
		insertSort(a, n); 
//		selectSort(a, n);  
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}
}
