package controlstructures;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class armstrongwhile {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.printf("Enter a number");
	int n=Integer.parseInt(br.readLine());
	int arm=0,r;
	int num=n;
	while(n>0)
	{
		r=n%10;
		arm=(r*r*r)+arm;
		n=n/10;
	}
	//System.out.println(arm);
	if(num==arm)
	{
		System.out.printf("Armstrong");
	}
	else
	{
		System.out.printf("Not an armstrong");
	}
	
	
	}

}
