package basicprogram;
import java.util.Scanner;
public class formatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.printf("Enter String:");
	String str=s.nextLine();
	System.out.printf("\n Enter String:");
	String str1=s.nextLine();
	System.out.printf("\n Enter Integer:");
	int number=s.nextInt();
	System.out.printf("\n Enter Integer:");
	int number1=s.nextInt();
	System.out.printf("Formatted output:");

	System.out.printf("\n%-15s %03d",str,number);
	System.out.printf("\n%-15s %03d",str1,number1);
	}

}
