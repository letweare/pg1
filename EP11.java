interface Animal{
	int id=1;
	void breathe ();
	void run();
}  
 class Dog  implements Animal {
	 public void breathe (){
		 System.out.println ("dog ÕıÔÚºôÎü");
	 }
	 public void run (){
		 System.out.println ("dog is running ");
	 }
 } 
 
 public class EP11{
	 public static void main (String [] args){
		 Dog dog= new Dog();
		 dog.breathe();
		 dog.run();
	 }
 }