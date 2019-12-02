package operator;
import java.util.Scanner;
public class seq2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	int r=num%10;
	int f=r*r;
	int ss=num/100;
	int t=ss*r;
	int res=f*t;
	System.out.printf("%d%d",f,t);
	System.out.printf("\n%d",res);

	}

}
