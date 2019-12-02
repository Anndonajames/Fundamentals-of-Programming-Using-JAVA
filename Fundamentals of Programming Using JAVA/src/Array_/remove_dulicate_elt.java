package Array_;
import java.util.Scanner;

public class remove_dulicate_elt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int size=5;
		System.out.println("Enter the array elts");
		int a[]=new int[size];
		
		int temp,i,j,k=0;
		for(i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(a[i]==a[j])
				{
					k++;
				}
				else
				{
					a[++i]==a[j++];
				}
			}}
		a[k++]=a[size-1];
		System.out.println(k);
					
				
	}}