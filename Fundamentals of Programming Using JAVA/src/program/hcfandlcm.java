package program;
import java.util.Scanner;
public class hcfandlcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.print("Enter First number:");
	int a=s.nextInt();
	System.out.print("Enter second number:");
	int b=s.nextInt();
	int i,j;
	int min=(a>b)?b:a;
	for(i=min;i>=1;i--)
	{
		if(a%i==0 && b%i==0)
		{
			System.out.print("GCD:");
			System.out.print(i);
			break;
		}
	}
	
	int max=(a>b?a:b);
	for(j=max;j<=(a*b);j++)
	{
		if(j%a==0 && j%b==0)
		{
			System.out.print("\nLCM:");
			System.out.print(j);
			break;
		}
	}
	}

}
