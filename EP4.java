class Animal {
	public Animal (String name ){
		System.out.println("我是一只"+name);
	}
} 
 class Dog extends Animal {
	pubilc Dog (){
		super("沙皮狗");
	}
 } 
  
public class EP4 {
	public static void main (String [] args){
		 Dog dog =new Dog();
		 
	}
}