package p1;

public class Triple<A,B,C> {

	A first; 
	B second;
	C third;
	
	public Triple(){};
	public Triple(A a, B b, C c){
		
		first = a;
		second = b;
		third = c;
		
	}
	
	public A getfirst(){
		return first;
	}
	
	public B getSecond(){
		return second;
	}
	public C getthird(){
		return third;
	}
	
	
}
