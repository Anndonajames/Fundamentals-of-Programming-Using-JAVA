package decisionmaking;
import java.util.Scanner;
public class ifelse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.printf("enter your product name");
		String pr=s.nextLine();
		if(pr.equals("a"))
		{
			System.out.printf("Available");
		}
		else
		{
			System.out.printf("Not Available");
		}
		
		}

	}


