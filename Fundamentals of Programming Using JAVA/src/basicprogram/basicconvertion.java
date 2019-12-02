package basicprogram;
import java.util.Scanner;
public class basicconvertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a character");
		char c=s.next().charAt(0);
		System.out.printf("Converted Number: %d",(int)c);

	}

}
