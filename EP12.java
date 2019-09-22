interface Animal{
	int id=1;
	void breathe ();
	void run();
}  

interface LandAnimal extends Animal {
	 void liveOnland ();
}


 class Dog  implements LandAnimal {
	 public void breathe (){
		 System.out.println ("dog ÕýÔÚºôÎü");
	 }
	 public void run (){
		 System.out.println ("dog is running ");
	 }
	 public void liveOnland (){
		 System.out.println("dog live on land");
	 }
 } 
 
 public class EP11{
	 public static void main (String [] args){
		 Dog dog= new Dog();
		 dog.breathe();
		 dog.run();
		 dog.liveOnland();
	 }
 }