package org.jzkangta.factorydemo01;
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
	 public static Car getCarInstance (){
		 return new Ford ();
	 }
 }
 
 public class FactoryDemo01{
	 public static void main (String [] args){
		  Car c= Factory.getCarInstance();
		  c.run();
		  c.stop();
	 }
 }
 
 
 
 
 
 