package org.jzkangta.factorydemo01;
 interface car {
	 public void run ();
	 public void stop ();
 } 
 class Benz implements Car {
	 public void run (){
		 System.out.pritnln("Benz��ʼ������");
	 } 
	 public void stop (){
		 System.out.println("Benz ͣ���ˣ�")
	 }
 }
 class Ford implements Car (){
	 public void run (){
		 System.out.println ("Ford ��ʼ�����ˣ�");
	 } 
	 public void stop() 
	 {
      System .out.println("Ford ͣ����");
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
 
 
 
 
 
 