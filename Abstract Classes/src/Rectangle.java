
public class Rectangle extends Shape {

	protected double width;
	protected double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	
	
@Override
	public double area() {
		return width*height;
	}
	

	public int test(){
		return 0;
	}
	
	public String test(int a){
		return "a";
	}

	@Override
	public double circumference() {
		
		return 2 *(width+height);
	}

}
