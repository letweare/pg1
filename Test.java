class Teacher implements Runnable {
	private int notes =80;
	public void run (){
		while (true ){
			dispatchNotes();
			if (notes <=0)
				break;
		}
	}
	private synchronized void dispatchNotes (){
		if (notes > 0){
			try{
				Thread.sleep(10);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"--发出笔记"+notes--);
		}
	}
}


public class Test {
     public static void main (String [] args ){
    	 Teacher t= new Teacher ();
    	 new Thread (t,"王1").start();
    	 new Thread (t,"王2").start();
    	 new Thread (t,"王3").start();
    	 
     }
}


 