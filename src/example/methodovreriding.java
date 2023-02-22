package example;

public class methodovreriding {
	public static void main(String[]args) {
		methodovreriding mo = new methodovreriding();
	mo.m1();
	mo.m1(10);
	mo.m1("acer");
	mo.m2();
	mo.m2(20);
		
		
		
	}
	public void m1() {
		System.out.println("zero p/m method ");
	}
	public void m1(int i) {
	 System.out.println("int aurgement method");		
	}
	public void m1(String s) {
		System.out.println("String aurgemnt method");
		}
	public static void m2() {
		System.out.println("no argument method");
	}	
	public static void m2(int i ) {
		System.out.println("int argument method");
	}

}
