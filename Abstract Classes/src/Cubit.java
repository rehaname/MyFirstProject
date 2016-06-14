
public class Cubit extends Rectangle {
	public double deepness;
	


	public Cubit(double width, double height, double deepness) {
		super(width, height);
		this.deepness = deepness;
	}
	
	public double volume(){
		return width*height*deepness;
	}



}
