package Week4;

public class Sphere extends Shape {
	private double radius = 0;

	public Sphere(double radius) {
		this.radius = radius;
	}

	@Override
	protected double getVolume() {
		// TODO Auto-generated method stub
		return 4 / 3 * 3.14 * Math.pow(this.radius, 3);
	}

	@Override
	protected double getArea() {
		// TODO Auto-generated method stub
		return 4 * 3.14 * Math.pow(this.radius, 2);
	}

	@Override
	protected double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Sphere [radius=" + radius + "]";
	}
	
}
