package Array;

public class Twodimensional {
public static void main(String[]args) {
	int  number [] []={{2,3,5,4},{5,4,8,9},{7,8,6,9}};
	System.out.println(number.length);
		System.out.println(number[1].length);
		System.out.println(number[2][3]);
		for(int i=0; i<number.length;i++) {
		for(int j=0; j<number[0].length;j++) {
			System.out.println(number[i][j]+" ");
		}
		
	}
}
}
