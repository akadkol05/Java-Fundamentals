package sumofnumbers;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int i,factorial=1,a;
		System.out.println("enter i:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for(i=1;i<=a;i++) {
			factorial=factorial*i;
		}
		System.out.println("factorial of"+a+"is:  "   +factorial);

	}

}
