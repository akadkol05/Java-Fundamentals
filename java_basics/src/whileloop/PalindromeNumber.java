package whileloop;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int reversednumber=0;
		while(temp>0) {
			int lastdigit= temp%10;
			 reversednumber=reversednumber * 10 + lastdigit; 
			 temp/=10;
		}
		if(reversednumber==n) {
			System.out.println(n+ "  is palindrome number");
		}
		else {
			System.out.println(n+ "  is not a palindrome number");
		}

	}

}
