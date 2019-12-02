package controlstructures;

import java.util.Scanner;

public class checkfibinnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int check=s.nextInt();
		int a=0;
		int b=1;
		int i,c;
		int f=0;
		if(check==0 || check==1)
		{
			System.out.print("Yes");
		}
		
			for(i=1;i<=100;i++)
			{
				 c=a+b;
				
				 if(check == c)
				 {
				 f++;
				 }
					a=b;
					b=c;
			}
			
			if(f!=0)
			{
				System.out.print("yes");
			}
			else
				System.out.print("no");
	}
}
			
			
		

	


