package Switch;
import java.util.Scanner;
public class nestedswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter College Name:");
		String college=s.nextLine();
		System.out.println("Enter department name:(Mech/MCA/CS)");
		String dept=s.nextLine();
		switch(college)
		{
			case "AJCE":
				switch (dept)
					{
					case "Mech":
						System.out.printf("Mech Seats are available");
						break;
					case "MCA":
						System.out.printf("MCA Seats are available");
						break;
	
					default:
						System.out.printf(" Branch is not available available1");					
						break;
					}
				break;
			case "MBC":
				switch (dept) 
				{
				case "Mech":
					System.out.printf("Mech Seats are available");
					break;
				case "CS":
					System.out.printf("CS Seats are available");
					break;
				default:
					System.out.printf(" Branch is not availabe2");
					break;
				}
				break;
			default:
				System.out.printf("College is not registered yet!!");				
				break;

		}
		}

}
