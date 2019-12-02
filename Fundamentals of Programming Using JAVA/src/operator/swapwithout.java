package operator;

import java.util.Scanner;

public class swapwithout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.printf("Before Swap: a= %d b=%d", a,b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.printf("\n After Swap: a= %d b=%d", a,b);
	}

}
