
public class Machine implements Info,IStartable{
int id;

public Machine(int id) {
	this.id = id;
}

@Override
public void showInfo() {
System.out.println("Robot's ID is "+ id);
	
}

@Override
public void start() { 
System.out.println("Machine has started");
}

@Override
public void stop() {
	System.out.println("Machine has stopped");
	
}
}
