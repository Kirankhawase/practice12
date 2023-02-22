package String;

public class Stringmethod {
public static void main(String[]args) {
	String S1= "Automation";
			System.out.println("Index :"+S1.charAt(3));
			System.out.println("Index :"+S1.charAt(7));
			
			String S2 = "manunal";
			String S3 = "manunal";
			
			System.out.println(S1.length());
			System.out.println(S2.equals(S3));
			
			String S4 = "java  java and python";
			System.out.println(S4.replaceAll("java","Automation"));
			
			String S5= "velocity";
					System.out.println(S5.replace('v','t'));
					
					String S6 ="velocity";
					System.out.println(S6.lastIndexOf("t"));
					
					String S7 ="VELOCITY";
					System.out.println(S7.toLowerCase());
					
					String S8 = "hello.java";
					
					String S9 [] =(S8.split("a"));
					for(int i=0; i<S9.length;i++) {
						System.out.println(S9[i]);
					} 
}

}
