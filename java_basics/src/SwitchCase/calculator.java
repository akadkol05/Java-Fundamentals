package SwitchCase;
import java.util.Scanner;

public class calculator {


	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter first number");
		int x=sc.nextInt();
		System.out.println("enter second number");
		int y=sc.nextInt();
		System.out.println("enter the operation");
        sc.nextLine();
		char operation =sc.nextLine().charAt(0);
		
		int result=0;
		switch(operation){
		case'+':
				result=x+y;
				break;
		case'-':
				result=x-y;
				break;
		case'*':
				result=x*y;
				break;
		case'/':
				result=x/y;
				break;
		default:
			
			System.out.println("invalid opertion");
				
	   }
	System.out.println("the result is ="  +result); 	

	}

	
		
}

