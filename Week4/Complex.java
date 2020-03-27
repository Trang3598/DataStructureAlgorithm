package Week4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Complex {
	private float real; // phan thuc
	private float image; // phan ao

	public Complex() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Complex(float r, float i) {
		this.real = r;
		this.image = i;
	}

	public float getReal() {
		return real;
	}

	public void setReal(float real) {
		this.real = real;
	}

	public float getImage() {
		return image;
	}

	public void setImage(float image) {
		this.image = image;
	}

	public Complex add(Complex c) {
		Complex com = new Complex();
		com.real = this.real + c.real;
		com.image = this.image + c.image;
		return com;
	}

	public Complex minus(Complex c) {
		Complex com = new Complex();
		com.real = this.real - c.real;
		com.image = this.image - c.image;
		return com;
	}

	public Complex time(Complex c) {
		Complex com = new Complex();
		com.real = this.real * c.real + this.image * c.image;
		com.image = this.real * c.image + this.image * c.real;
		return c;
	}

	public float realpart() {
		return real;
	}

	public float imagepart() {
		return image;
	}

	@Override
	public String toString() {
		if (this.image > 0)
			return this.real + "+" + this.image + "i";
		else
			return this.real + this.image + "i";
	}

	public static void main(String[] args) {
		// input n complex
		Scanner scan = new Scanner(System.in);
		System.out.println("Input n = ");
		int n = scan.nextInt();
		Random random = new Random();
		ArrayList<Complex> list = new ArrayList<Complex>();
		for (int i = 0; i < n; i++) {
			Complex com = new Complex(random.nextFloat(), random.nextFloat());
			list.add(com);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// find complex at index = v
		System.out.println("Input index of the element what want to find ");
		int v = scan.nextInt();
		System.out.println("Result = ");
		for (int i = 0; i < list.size(); i++) {
			if (v == i) {
				System.out.println(list.get(i));
			}
		}

		// sum of n complex number
		Complex sum = new Complex(0, 0);
		for (int i = 0; i < list.size(); i++) {
			sum.real = list.get(i).real + sum.real;
			sum.image = list.get(i).image + sum.image;
		}
		System.out.println("Total of n complex number = " + sum);
	}
}
