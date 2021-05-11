package OOPS;
class Vehicles{
	int wheels;
	int headlights; 
	String color;
			
	Vehicles(int wheels){
	 this.wheels=wheels;
	 headlights = 2;
	}
	Vehicles(int wheels , String color){
		this.wheels=wheels;
		this.color=color;
		headlights=2;
	}
}
public class ConstructorOverloading {
		public static void main(String[] args) {
				Vehicles car = new Vehicles(4);
				Vehicles eRikshaw = new Vehicles(2,"Yellow");
				
				System.out.println(car.wheels + " wheels ");
				System.out.println(eRikshaw.wheels + " wheels and color is "+eRikshaw.color);
			

			}

		


	}


