package operator;
import java.util.Scanner;
public class seq1 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=a/10;
		int r= a%10;
		int p=b*r;
		int q=b*b;
		System.out.printf("%d %d",p,q);
	}

}
