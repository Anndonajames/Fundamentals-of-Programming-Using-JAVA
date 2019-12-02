package decisionmaking;
import java.util.Scanner;
public class nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.printf("enter brand/n Enter memmory /n Enter hdd/n");
	String brand=s.nextLine();
	int mem=s.nextInt();
	int hdd=s.nextInt();
	if(brand.equals("hp"))
	{
		if(mem==32)
		{
			if(hdd==3)
			{
				System.out.printf("Available");
			}
			else
			{
				System.out.printf("Not available");
			}
		}
		else 
		{
			System.out.printf("not availble");
		}
	}
	
	else
	{
		System.out.println("Not available");
	}
	}

}
