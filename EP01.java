class Animal
{ 
	 String name ;
	 void shout () { 
		 System.out.println("¶¯Îï½Ð");
	 }
}  

class Dog extends Animal
{ 
	 public void printName (){
		 System.out.println("name"+name);
		 }
}  
 public class EP1
 { 
	 public static void main (String [] args)
	 {
		 Dog dog =new Dog();
		 dog.name="É³Æ¤¹·";
		 dog.printName();
		 dog.shout();
	 }
 }