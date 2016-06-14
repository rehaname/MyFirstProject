package Mypackage;

public class Pri{
    public static void main(String argv[]){
    	Pri r = new Pri();
	r.amethod(r);
    }
	private int i;
    public void amethod(Pri r){
	int i=99;
	multi(r);
	System.out.println(i);
    }
    public void multi(Pri r){
	r.i = r.i*2;
    }
}
