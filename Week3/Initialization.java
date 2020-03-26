package Week3;

import java.util.Random;

public class Initialization {
	public static void inputArray(int a[], int n) {
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(100);
		}
	}

	public static void outputArray(int a[], int n) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n");
	}
}
