package Array_;
import java.util.Scanner;
public class Largest_elt_in_arry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int size=5;
		System.out.println("Enter the array elts");
		int a[]=new int[size];
		int temp,i,j;
		for(i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
			
			
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		}
			System.out.println(a[size-2]);
		

	}
	}


