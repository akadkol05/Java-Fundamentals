package forloops;

public class Mulof3n5 {  
	
	public static void main(String[] args) {
		
		int x =8;
		int sum=0;
		boolean check =false;
		for(int i=0; i<=x; i++) {
			
			if(i==x) {
				check=true;
			}
			
			if(i%2==0 || i%4==0) {
				if(check) {
					break;
				}
				sum +=i;
			}
		}
		System.out.println(sum);
		
		
		
	}
	
	

}
