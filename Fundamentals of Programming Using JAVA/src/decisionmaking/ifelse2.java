package decisionmaking;

import java.util.Scanner;

public class ifelse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.printf("enter your qualification");
		String pr=s.nextLine();
		if(pr.equals("MCA"))
		{
			System.out.printf("eligible");
		}
		else
		{
			System.out.printf("Not eligible");
		}
			
	}

}
