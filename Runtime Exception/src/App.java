import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {

	public static void main(String[] args) {
//	String text = null;
//	
//	System.out.println(text.length());
	int k =0 ;
	assert (k!=0);
	
	try{
		int i = 6/k;
	}catch(ArithmeticException e){
		System.out.println("EXCEPTION");
	}
	
	String[] text ={"one","two","thress"};
	try{
	System.out.println(text[3]);
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("out of bounds");
	}
	
	List<String> listofStrings = new ArrayList<String>();
	listofStrings.add("Melvin");
	listofStrings.add("Kanen");
	listofStrings.add("Jerica");
	listofStrings.add("Jaybee");
	
	for(Iterator<String>i = listofStrings.iterator();i.hasNext();){
		String s = i.next();
		System.out.println(s);
	}
	
	}
	
	
	
}
