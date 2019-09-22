package fac;
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
		 System.out.println("�첻�ˣ�");
	 }
 }
 
 
 
 
 
 