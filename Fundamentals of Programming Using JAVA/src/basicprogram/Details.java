package basicprogram;
import java.util.Scanner;
public class Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.printf("Enter Your Name:");
	String name=s.nextLine();
	System.out.printf("Enter College Name :");
	String college=s.nextLine();
	System.out.printf("Enter Course:");
	String course=s.nextLine();
	System.out.printf("Enter Department:");
	String Dept=s.nextLine();
	System.out.printf("\n Name   : %s",name);
	System.out.printf("\n College Name   : %s",college);
	System.out.printf("\n Course   : %s",course);
	System.out.printf("\n Department   : %s",Dept);
	}

}
