class Box {
	static   int  [] a  =new int [100];
}

class Tx extends Thread {
	public  void run (){
		 while (true ){
			 Thread t = Thread.currentThread();
		for (int i=0;i<49;i++){ 
			if (Box.a[i]==0){
			System.out.println(t.getName()+"正在下载"+Box.a[i]);
			Box.a[i]=1;
			if (i==49 ) break;
			}
		}
	}
}
} 
class Tx1 extends Thread {
	public  void run (){
		 while (true ){
			 Thread t = Thread.currentThread();
		for (int i=49;i<100;i++){
			if (Box .a[i]==0){
			System.out.println(t.getName()+"正在下载"+Box.a[i]);
			if(i==100) break;
			Box.a[i]=1;
		}
		}
	}
}
}



public class Xi {
    
	  public static void main (String [] args ){
		  new Tx().start();
		  new Tx1().start();
	  }
	
	

	
	
	
	
}
