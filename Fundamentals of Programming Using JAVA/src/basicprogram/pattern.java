package basicprogram;
import java.util.Scanner;
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the floating point value");
	float fl=s.nextFloat();
	System.out.printf("\n %d",(int)fl);
	System.out.printf("\n %.1f",fl);
	System.out.printf("\n %.2f",fl);
	System.out.printf("\n %.3f",fl);
	}

}
