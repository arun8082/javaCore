import java.util.*;

public class Comparison
{

	public static void main(String[] args) 
	{
		int num1;
		int num2;
		if(args.length !=2){
			System.out.println("Must have 2 arguments");
			return;
		}
		num1=Integer.parseInt(args[0]);
		num2=Integer.parseInt(args[1]);
		if(num1<num2){
			System.out.println(num1+" is less than "+num2);
		}else if(num1>num2){
			System.out.println(num1+" is greater than "+num2);
		}else{
			System.out.println(num1+" is equal to "+num2);
		}		
	}
}
