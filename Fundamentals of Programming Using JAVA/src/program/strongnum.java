package program;
import java.util.Scanner;
public class strongnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sr=new Scanner(System.in);
	int num=sr.nextInt();
	int r,f,n,s=0,i;
	n=num;
	while(num>0)
	{
		r=num%10;
		f=1;
		for(i=1;i<=r;i++)
		{
			f=f*i;	
		}
		s=s+f;
		num=num/10;
		
	}
	//System.out.print(f);
	//System.out.print(s);
	if(s==n)
	{
	System.out.println("strong num");
	}
	else
	{
		System.out.println("not strong num");
	}
	
	sr.close();
	}
	
}
