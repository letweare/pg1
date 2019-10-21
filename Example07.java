class MaxPriority implements Runnable{
	 public void run (){
		 for (int i=0;i<10;i++){
			 System.out.println(Thread.currentThread().getName()+"正在输出："+i);
		
		 }
	 }
}

class MinPriority implements Runnable{
	 public void run (){
		 for (int i=0;i<10;i++){
			 System.out.println(Thread.currentThread().getName()+"正在输出："+i);
		
		 }
	 }
}



public class Example07 {
    public static void main (String [] args ){
    	Thread minpriority =new Thread(new MinPriority(),"优先级较低的");
    	Thread maxpriority = new Thread (new MaxPriority() ,"优先级较高的");
    	minpriority .setPriority(Thread.MIN_PRIORITY);
    	maxpriority.setPriority(10);
    	maxpriority.start();
    	minpriority.start();
    }
}
