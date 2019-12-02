package Array_;
import java.util.Scanner;

public class replace_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println("Enter the character to replace:");
		char ch=s.next().charAt(0);
		String replce=str.replace(ch,'*');
		System.out.println(replce);
		
	}

}
