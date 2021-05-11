package Methods;

public class Introduction {

	public static void main(String[] args) {
	int firstnumber=34;
	int secondnumber=23;
	int result = maxOf(firstnumber,secondnumber);
	maxOf(100,200);
	maxOf(10,20);
	     System.out.println(result);
     sayHi();
     sayHi();
	}  
    static int maxOf(int a , int b){
	 {
			return a>b? a:b;
			
		}
		
	}
    static void sayHi() {
    	System.out.println("hi");
    	System.out.println("Good Morning");
    }
        
}
