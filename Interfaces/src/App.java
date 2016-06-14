
public class App {

	public static void main(String[] args) {
		
		Machine mac = new Machine(12345);
		Person per = new Person("Melvin");
		
		mac.showInfo();
		per.showInfo();
		mac.start();
		mac.stop();
		
		

	}

}
