class Tax implements Runnable {
	private int notes =100;
	public void run (){
		while (true ){
			dispatchNotes();
			if (notes <=0){
				System.out.println("乘客已送完！");
				break;
			}
		}
	}
	private synchronized void dispatchNotes (){
		if (notes > 0){
			try{
				Thread.sleep(10);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"--发车"+notes--);
		}
	}
}


public class Taxi {
     public static void main (String [] args ){
    	 Tax t= new Tax ();
    	 new Thread (t,"车1").start();
    	 new Thread (t,"车2").start();
    	 new Thread (t,"车3").start();
    	 new Thread (t,"车4").start();
    	 new Thread (t,"车5").start();
    	 
    	 
     }
}


 