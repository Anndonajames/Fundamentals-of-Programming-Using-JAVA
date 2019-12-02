package casestudy3;
import java.util.Scanner;
public class Reg {
	public static void Registration()
	{
		
		Scanner s=new Scanner(System.in);
		String name;
		String adress;
		String contact;
		String email;
		String prooftype;
		String proofid;
		String cont;
		String update;
		do
		{
		int i=1;
		System.out.println("Registration");
		System.out.println("Enter your name");
		name=s.nextLine();
		System.out.println("Enter your address");
		adress=s.nextLine();
		System.out.println("Contact Number");
		contact=s.nextLine();
		System.out.println("E-Mail ID");
		email=s.nextLine();
		System.out.println("Enter proof type");
		prooftype=s.nextLine();
		System.out.println("Enter proof Id:");
		proofid=s.nextLine();
		System.out.println("Thank you for registering your id is "+i);
		i++;
		System.out.println("Do you want to continue registration(y/n)?");
		cont=s.nextLine();
		}while(cont.equals("y"));
		do
		{
		
		System.out.println("Update Email:");
		System.out.println("Enter new  Email-ID:");
		email=s.nextLine();
		System.out.println("Email Updated");
		System.out.println("Do you want to update the E-Mail Id?(yes/no)");
		update=s.nextLine();
		}while(update.equals("yes"));
		
		
		System.out.println("Name:"+name);
		System.out.println("Address:"+adress);
		System.out.println("Contact Number:"+contact);
		System.out.println("Email Id:"+email);
		System.out.println("Proof type:"+prooftype);
		System.out.println("Proof Id:"+proofid);
		
		}
		
		
	}

