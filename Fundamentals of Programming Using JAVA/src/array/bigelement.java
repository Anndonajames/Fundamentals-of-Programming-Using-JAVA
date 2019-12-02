package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bigelement {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of array");
		int size=Integer.parseInt(br.readLine());
		int[] arr1=new int[size];
		int big=0,i;
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
			
		System.out.println("Biggest Element 2"+big);
		
		}		
	}

