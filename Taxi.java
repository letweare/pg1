class Tax implements Runnable {
	private int notes =100;
	public void run (){
		while (true ){
			dispatchNotes();
			if (notes <=0){
				System.out.println("�˿������꣡");
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
			System.out.println(Thread.currentThread().getName()+"--����"+notes--);
		}
	}
}


public class Taxi {
     public static void main (String [] args ){
    	 Tax t= new Tax ();
    	 new Thread (t,"��1").start();
    	 new Thread (t,"��2").start();
    	 new Thread (t,"��3").start();
    	 new Thread (t,"��4").start();
    	 new Thread (t,"��5").start();
    	 
    	 
     }
}


 