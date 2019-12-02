package casestudy2;
import java.util.Scanner;
public class casestudy2 {

	
		
		public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str;
		do {
		System.out.println("Enter the option");
		System.out.println("1.Book");
		System.out.println("2.Check Status");
		System.out.println("3.Exit");
		int n=s.nextInt();
		BookStatus bb=new BookStatus();
		
		switch(n)
		{
		case 1:
			bb.book();
			break;
		case 2:
			
			bb.status();
			break;
		case 3:
			System.out.println("Exit");
			break;
			
		default:
			System.out.println("Invalid Option");
			break;
		}
		str=s.next();
		}while(str.equals("No"));
		
		}

		}


	