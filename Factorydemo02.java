package fac;
 interface car {
	 public void run ();
	 public void stop ();
 } 
 class Benz implements Car {
	 public void run (){
		 System.out.pritnln("Benz开始启动了");
	 } 
	 public void stop (){
		 System.out.println("Benz 停车了！")
	 }
 }
 class Ford implements Car (){
	 public void run (){
		 System.out.println ("Ford 开始启动了！");
	 } 
	 public void stop() 
	 {
      System .out.println("Ford 停车了");
	 }
 } 
 
 class Factory {
	 public static Car getCarInstance(String type){
		 Car c=null;
		 if("Benz".equals(type)){
			 c=new Benz();
		 } 
		 if("Ford".equals(type)){
			 c= new Ford();
		 }
		 return c;
	 }
 }
 
 public class FactoryDemo02{
	 public static void main (String [] args){
		  Car c= Factory.getCarInstance("Benz");
		  c.run();
		  c.stop();
	 }else {
		 System.out.println("造不了！");
	 }
 }
 
 
 
 
 
 