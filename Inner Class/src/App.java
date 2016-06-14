
public class App {

	public static void main(String[] args) {
		Robot rob= new Robot(123456.5);
		rob.play();
		Robot.Brain robrain = rob.new Brain();
		
		robrain.think();

	}

}
