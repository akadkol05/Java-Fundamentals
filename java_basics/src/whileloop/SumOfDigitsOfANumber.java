package whileloop;

import java.util.Scanner;

public class SumOfDigitsOfANumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		
		while(temp>0) {
			int lastDigit=temp%10;
			temp /=10;
			 sum+=lastDigit;
			 System.out.println(lastDigit+" "+temp+" "+sum);
			
		}
		System.out.println("the sum of digits of"+ n +" is" +sum);     
		
		
//		using for loop lso you can do: 
//		 int numberofDigits=(int)Math.log10(n)+1;
//		 System.out.println("number of digits is " +numberofDigits);
//		 for(int i=1;i>=numberofDigits;i++) {
//			 int lastDigit=temp;
//			  sum=sum+lastDigit+i;
//		 }
//		 System.out.println("sum of digits of "+n+" " +sum);
	}

}

