package sumofnumbers;

import java.util.Scanner;

public class RectyaSquare {

	public static void main(String[] args) {
     Scanner src=new Scanner(System.in);
     int a=src.nextInt();
     int b=src.nextInt();
     int c=src.nextInt();
     int d=src.nextInt();
	if(a==b &&a==c&&a==d) {
			System.out.println("it is a square");
			
		}
	else{
		System.out.println("it is a rectangle");
	}
			
	}

}
