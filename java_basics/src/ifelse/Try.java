package ifelse;

public class Try {

	public static void main(String[] args) {
		int N=3;
	        
	        if(N%2 ==0 && N>=2 && N<=5){
	             System.out.println("Not Weird");
	        }else if(N%2 ==0 && N>=6 && N<=20) {
	        	System.out.println("Weird");
	        }else if(N%2 ==0 && N<20) {
	        	System.out.println("Not Weird");
	        }
	        else{
	            System.out.println("Weird");
	        }
	}

}
