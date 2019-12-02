package decisionmaking;

import java.util.Scanner;

public class ifelseif1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.printf("Enter your age");
		int age=s.nextInt();
		if(age>=60)
		{
			System.out.printf("old ager");
		}
		else if(age>35 && age<59)
		{
			System.out.printf("Middle Ager");
		}
		else if(age<34 && age>20)
		{
			System.out.println("Younger");
		}
		else if(age>13 && age<19)		
		{
			System.out.println("Teenager");
		}
		else
		{
			System.out.println("Kid");
		}
	}

}
