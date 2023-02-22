package method;

public class ConcreatClass extends incompleatclass {
public static void main(String[] args) {

	compleatclass cc=new compleatclass();
	cc.m1();
	cc.m2();
	
	incompleatclass   ic =new  ConcreatClass();
	ic.m4();
	ic.m5();
}

@Override
public void m4() {
System.out.println("hiii");

}

@Override
public void m5() {
System.out.println("goood morning");	
} 


}
