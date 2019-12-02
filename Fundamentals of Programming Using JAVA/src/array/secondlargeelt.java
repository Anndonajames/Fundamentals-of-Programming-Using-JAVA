package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

public class secondlargeelt {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of array");
		int size=Integer.parseInt(br.readLine());
		int[] arr1=new int[size];
		int i,t=0;
		for(i=0;i<size;i++)
		{
			arr1[i]=Integer.parseInt(br.readLine());
		}
		
		for(i=0;i<size;i++)
		{
			if(a[i])
			t=arr1[i];
			arr1[i]=arr1[i++];
			arr1[i++]=t;
		}
		/*for(i=0;i<size;i++)
		{*/
			System.out.print(t);
		//}
		
		
		
		/*int big,sec,i,t=0;
		big=sec=0;
		System.out.printf("Enter the array %d elements ",size);
		for(i=0;i<size;i++)
		{
			arr1[i]=Integer.parseInt(br.readLine());
		}
		
		
		for(i=0;i<size;i++)
		{
			if(arr1[i]>big) 
				{
				big=arr1[i];	
				}
		
			
		}
		for(i=0;i<size;i++)
		{
			if(arr1[i]<big && big>t) 
				{
				t=arr1[i];	
				}
		
			
		}
			
		System.out.println("Biggest Element "+t);
		
		*/
		
		}
		
	}


