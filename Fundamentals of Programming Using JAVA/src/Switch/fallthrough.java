package Switch;
import java.util.Scanner;
public class fallthrough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	int r=num%10;
	int q=num/10;
	int t=0;
	if(q!=1)
	{
	switch(r)
	{
		case 1:
		case 2:
		case 6:
		case 10:
			t=t+3;
			break;
			
		case 4:
		case 5:
		case 9:
			t=t+4;
			break;
		case 3:
		case 7:
		case 8:
			t=t+5;
			break;
	}
	switch(q)
	{
	case 2:
	case 3:
	case 4:
	case 8:
	case 9:
		t=t+6;
		break;
		
			
	case 5:
	case 6:
		t=t+5;
		break;
	case 7:
		t=t+7;
		break;
		
	}

}
	else 
	{
		switch(r)
		{
		case 1:
		case 2:
			t=t+6;
			break;
		case 3:
		case 4:
		case 8:
		case 9:
			t=t+8;
			break;
		}
		//break;
	}
	System.out.println(t);
}
	
}