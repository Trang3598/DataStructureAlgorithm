package Week4;

public class Circle extends Shape {
	private double radius = 0;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	protected double getVolume() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected double getArea() {
		// TODO Auto-generated method stub
		return 3.14 * Math.pow(this.radius, 2);
	}

	@Override
	protected double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * 3.14 * this.radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
