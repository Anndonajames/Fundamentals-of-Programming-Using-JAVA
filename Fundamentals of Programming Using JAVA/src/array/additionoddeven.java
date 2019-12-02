package array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class additionoddeven {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of array");
		int size=Integer.parseInt(br.readLine());
		int arr1[]=new int[size];
		//int odd[]=new int[size];
		//int even[]=new int[size];
		int es=0,os=0;
		float e,o;
		int i,j,ecount=0,ocount=0,av1=0,av2=0;
		System.out.printf("Enter the array %d elements ",size);
		for(i=0;i<size;i++)
		{
			arr1[i]=Integer.parseInt(br.readLine());
		}
		
		
		for(i=0;i<size;i++)
		{
			if(arr1[i]%2==0) 
				{
				System.out.println(arr1[i]);	
				es=es+arr1[i];				
					ecount++;
				}
		}
			for(i=0;i<size;i++)
			{
				if(arr1[i]%2!=0) 
					{
					System.out.println(arr1[i]);	
					os=os+arr1[i];				
						ocount++;
					}
			}
		
		e=es/ecount;
		o=os/ocount;
		System.out.print("Even Numbers Average:");
		System.out.print(e);
		System.out.print("Odd Numbers Average:");
		System.out.print(o);
		}		
	}


