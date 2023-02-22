package example;

public class child extends parent {

	@Override
	public void car() {
		System.out.println("car-- kia");
		super.car();
	}

	@Override
	public void bike() {
		System.out.println("bike--fz");
		super.bike();
	}

	@Override
	public void truck() {
		System.out.println("truck--ashokleland");
		super.truck();
	}
public void m1() {
	System.out.println("zero/p me");
}
}
