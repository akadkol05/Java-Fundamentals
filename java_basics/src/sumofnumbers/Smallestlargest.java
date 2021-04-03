package sumofnumbers;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Smallestlargest {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements in array:");
        int n = s.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++)
        {
            array[i] = s.nextInt();
        }
        int largest=0;
		int smaller=array[0];
		 
		for(int i = 0; i < n; i++){
			
			if(array[i]>largest) {
				largest =array[i];
			}
			if(array[i]<smaller) {
				smaller=array[i];
			}
		}
		System.out.println(largest);
		System.out.println(smaller);

	}
}

// u there  ?