
public class Rectangle extends Shape {

	private double width;
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	private double height;
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width*height;
	}

	@Override
	public double circumference() {
		
		return 2 *(width+height);
	}

}
