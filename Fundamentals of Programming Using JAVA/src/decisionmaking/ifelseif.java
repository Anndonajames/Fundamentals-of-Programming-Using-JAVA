package decisionmaking;
import java.util.Scanner;
public class ifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	int mark=s.nextInt();
	if(mark>=90)
	{
		System.out.printf("A");
	}
	else if(mark<89 && mark >70)
	{
		System.out.printf("B");
	}
	else if(mark <69 && mark >50)
	{
		System.out.println("C");
	}
	else
	{
		System.out.println("Fail");
	}
	}

}
