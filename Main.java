class t1 implements Runnable {
	public void  run (){
		for (int i=0;i<50;i++){
			System.out.println("new");
		}
	}
}
public class Main {
     public static  void main (String [] args ){
    	 new Thread(new  t1() ).start();
    	 for(int i=0;i<100;i++){
    		 System.out.println("main");
    	 }
     }
}
