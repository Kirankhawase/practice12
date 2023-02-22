package logical;

public class example1 {
public static void main(String[]args) {
	String S1="good morning";
	System.out.println(S1.length());
	
	int  len= S1.length();
	String  Revers="";
	 for(int i= S1.length()-1; i>=0; i--) {
	 Revers= Revers  +S1.charAt(i);
	 
	
	
	}
	 System.out.println(Revers);
}


}