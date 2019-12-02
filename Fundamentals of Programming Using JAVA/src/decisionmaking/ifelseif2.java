package decisionmaking;
import java.util.Scanner;
public class ifelseif2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.printf("Enter three numbers ");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		if(a>b && a>c && a>d)
		{
			System.out.printf("%d is greater",a);
		}
		else if(b>a && b>c && b>c)
		{
			System.out.printf("%d is greater",b);
		}
		else if(c>a && c>b && c>d)
		{
			System.out.printf("%d is greater",c);
		}
		
		else
		{
			System.out.printf("%d is greater",d);
		}
	}

}
