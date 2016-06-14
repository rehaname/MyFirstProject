
public class Circle extends Shape {
	
	private double radius;
	public static final double PI=3.14159265358979323846;

	public Circle(double radius) {
		this.radius = radius;
	}

@Override
	public double area() {
		// TODO Auto-generated method stub
		return PI * radius * radius;
	}

@Override
	public double circumference() {
		// TODO Auto-generated method stub
		return 2*PI*radius;
	}

}
