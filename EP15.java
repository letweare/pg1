interface Animal {
	void shout ();
} 


class Cat implements Animal {
	public void shout (){
		System.out.println("miao....");
	} 
	void sleep(){
		 System.out.println("Cat is sleeping ");
	}
}
class Dog implements Animal {
	public void shout () {
		System.out.println("wang wang ...");
	}
} 


public class EP15{
	 public static void main (String [] args )
	 {
		 Dog dog =new Dog ();
		 animalShout(dog);
	 } 
	 public static void animalShout (Animal animal ){
		if(animal instanceof Cat ){
			Cat cat =(Cat ) animal;
			cat.sleep();
			cat.shout();
		}else {
			System.out.println ("This animal is not a  cat");
		}
	 }
}