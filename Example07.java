class MaxPriority implements Runnable{
	 public void run (){
		 for (int i=0;i<10;i++){
			 System.out.println(Thread.currentThread().getName()+"���������"+i);
		
		 }
	 }
}

class MinPriority implements Runnable{
	 public void run (){
		 for (int i=0;i<10;i++){
			 System.out.println(Thread.currentThread().getName()+"���������"+i);
		
		 }
	 }
}



public class Example07 {
    public static void main (String [] args ){
    	Thread minpriority =new Thread(new MinPriority(),"���ȼ��ϵ͵�");
    	Thread maxpriority = new Thread (new MaxPriority() ,"���ȼ��ϸߵ�");
    	minpriority .setPriority(Thread.MIN_PRIORITY);
    	maxpriority.setPriority(10);
    	maxpriority.start();
    	minpriority.start();
    }
}
