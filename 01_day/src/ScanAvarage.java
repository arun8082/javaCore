import java.util.*;

public class ScanAvarage
{

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter Num1: ");
		int num1=0;
		if(!scan.hasNextInt()){
			System.out.println("Only Interger value is allowed");
			return;
		}else{
			num1=scan.nextInt();
		}
		
		System.out.print("Enter Num2: ");
		int num2;
		if(!scan.hasNextInt()){
			System.out.println("Only Interger value is allowed");
			return;
		}else{
			num2=scan.nextInt();
		}

		float avg=(float)(num1+num2)/2;
		System.out.println("Avarage: "+avg);
	}
}
