
public class Person implements Info {
String name;

public Person(String name) {
	this.name = name;
}

@Override
public void showInfo() {
	System.out.println("Person's Name is " + name);
	
}
}
