package MethodR;

public class OverRide {
public static void main(String[]args) {
	OverRide OR= new OverRide();
	OR.m1();
	OR.m1(20);
	OR.m1("goood");
	
	
	
	
}
public void m1() {
	System.out.println("zero i/p");
	
}
public void m1(int i) {
	System.out.println(20);
}
public void m1(String s) {
	System.out.println("good");
}
}
