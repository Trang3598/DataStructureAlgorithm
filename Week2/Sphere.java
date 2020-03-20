import java.util.Scanner;

public class Sphere {
	private int r, x, y, z;

	public Sphere() {
		r = 0;
		x = 0;
		y = 0;
		z = 0;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public Sphere(int r, int x, int y, int z) {
		super();
		this.r = r;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double getArea(Sphere s) {
		return 4 * 3.14 * Math.pow(s.r, 2);
	}

	public double getVolume(Sphere s) {
		return 4 / 3 * 3.14 * Math.pow(s.r, 3);
	}

	public double distance(Sphere s1, Sphere s2) {
		return Math.sqrt(Math.pow(s1.x - s2.x, 2) + Math.pow(s1.y - s2.y, 2) + Math.pow(s1.z - s2.z, 2));
	}

	@Override
	public String toString() {
		return "Sphere [r=" + r + ", x=" + x + ", y=" + y + ", z=" + z + "]";
	}

	public boolean isContained(Sphere s1, Sphere s2) {
		return (s1.distance(s1, s2) <= Math.abs(s1.r - s2.r));
	}

	public boolean isOverlapped(Sphere s1, Sphere s2) {
		return ((distance(s1, s2) > Math.abs(s1.r - s2.r)) && (distance(s1, s2) <= (s1.r + s2.r)));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r1, x1, y1, z1;
		int r2, x2, y2, z2;
		System.out.println("Input the first sphere");
		System.out.println("Input radios");
		r1 = sc.nextInt();
		System.out.println("Input coordinates of this sphere");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		z1 = sc.nextInt();
		Sphere s1 = new Sphere(r1, x1, y1, z1);
		System.out.println("Area is: " + s1.getArea(s1));
		System.out.println("Volume is: " + s1.getVolume(s1));
		System.out.println("-----------");
		System.out.println("Input the second sphere");
		System.out.println("Input radios");
		r2 = sc.nextInt();
		System.out.println("Input coordinates of this sphere");
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		z2 = sc.nextInt();
		Sphere s2 = new Sphere(r2, x2, y2, z2);
		if (s1.isContained(s1, s2) == true) {
			System.out.println("Contained");
		} else {
			System.out.println("No Contained");
		}
		if (s1.isOverlapped(s1, s2) == true) {
			System.out.println("Overlapped");
		} else {
			System.out.println("No overlapped");
		}
	}
}
