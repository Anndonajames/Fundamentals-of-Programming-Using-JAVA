package decisionmaking;
import java.util.Scanner;
public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner s=new Scanner(System.in);
	System.out.printf("enter your mark");
	int mark=s.nextInt();
	if(mark>50)
	{
		System.out.printf("Pass");
	}
	else
	{
		System.out.printf("Fail");
	}
	}

}
