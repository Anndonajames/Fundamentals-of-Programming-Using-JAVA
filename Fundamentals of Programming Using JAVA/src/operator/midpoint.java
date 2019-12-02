package operator;
import java.util.Scanner;
public class midpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.printf("Enter the first point coordinates:");
		int x1=s.nextInt();
		int y1=s.nextInt();
		System.out.printf("Enter the second point  coordinates:");
		int x2=s.nextInt();
		int y2=s.nextInt();
		int mid1=x1+x2/2;
		int mid2=y1+y2/2;
		System.out.printf(" Midpoint : %d  %d",mid1,mid2);		
	}

}
