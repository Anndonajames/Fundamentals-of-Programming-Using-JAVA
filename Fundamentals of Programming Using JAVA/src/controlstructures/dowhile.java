package controlstructures;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class dowhile {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	int s=0,num;
	do

	{
		System.out.print("Enter the values");
		 num=Integer.parseInt(br.readLine());
		if(num>0)
		{
			s=s+num;
			
		}	
	}
	while(num>0);
	System.out.print(s);
	
	}

}
