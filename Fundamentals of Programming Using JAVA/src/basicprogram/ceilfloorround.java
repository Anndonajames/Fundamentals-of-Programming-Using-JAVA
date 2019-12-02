package basicprogram;
import java.util.*;

public class ceilfloorround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.printf("\n Enter float Value");
		float number=s.nextFloat();
		
		System.out.printf("\n %d",Math.round(number));
		System.out.printf("\n %.1f",Math.ceil(number));
		System.out.printf("\n %.1f",Math.floor(number));

	}

}
