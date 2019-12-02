package controlstructures;
import java.util.Scanner;
public class fibinacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		Scanner s=new Scanner(System.in);
		int limit=s.nextInt();
		int a=0;
		int b=1;
		int i,c;
		System.out.print(a +" ");
		System.out.print(b +" ");
		for(i=3;i<=limit;i++)
		{
			 c=a+b;
			System.out.print(c +" ");
			a=b;
			b=c;
			
		}
	}

}
