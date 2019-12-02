package operator;
import java.util.Scanner;;
public class swapwithvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			int b=s.nextInt();
			System.out.printf("Before Swap: a= %d b=%d", a,b);
			int temp;
			temp=a;
			a=b;
			b=temp;
			System.out.printf("\n After Swap: a= %d b=%d", a,b);
			}

		}

