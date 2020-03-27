package Week4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ShapeMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Input n = ");
		int n = scan.nextInt();
		Random random = new Random();
		ArrayList<Shape> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			Circle circle = new Circle(random.nextDouble());
			Sphere sphere = new Sphere(random.nextDouble());
			Rectangle rectangle = new Rectangle(random.nextDouble(), random.nextDouble());
			list.add(circle);
			list.add(sphere);
			list.add(rectangle);
		}
		System.out.println("List shape: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			System.out.println("Area = " + list.get(i).getArea());
			if (list.get(i).toString().contains("Circle") == true || list.get(i).toString().contains("Rectangle") == true) {
				System.out.println("Perimeter = " + list.get(i).getPerimeter());
			}
			if (list.get(i).toString().contains("Sphere") == true) {
				System.out.println("Volume = " + list.get(i).getVolume());
			}
			System.out.println("--------------");
		}

	}

}
