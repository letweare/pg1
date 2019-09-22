interface Animal{
	void shout();
}
class  Cat implements Animal{
	public void shout (){
		System.out.println("miao miao ");
	}
	void sleep (){
		System.out.println("Cat is sleeping");
	}
}    

public class EP14{
	public static void main (String [] args){
		Cat cat =new Cat();
		animalShout(cat);
	} 
	public static void animalShout (Animal animal){ 
		Cat cat=(Cat) animal ;
		cat.shout();
		cat.sleep();
	}
}