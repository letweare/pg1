import java.util.Random;
class Storage { 
	private String [] cells = new String [10];
	private int inpos ,outpos; 
	int cout=0;
    public void put (int num){
    	cout++;
    Random	r1=new Random();
    num= r1.nextInt();
    	cells [inpos]=String.valueOf(num);
    	System.out.println("用户"+cells[inpos]+"登陆");
    	inpos++;
    	if(inpos==cells.length) 
    		inpos=0;
    	System.out.println("当前在线人数"+cout);
    }
    public void get (){ 
    	cout--;
      System.out.println("用户"+cells[outpos]+"注销");
      outpos++;
      if(outpos==cells.length)
    	  outpos=0;
      System.out.println("当前在线人数"+cout);
    }
}
 

class Input  implements Runnable {
	   private Storage s1;
	   private int num,t;
	   Random r;
	   
	   Input (Storage s1){
		   r= new Random();
		   
		   this.s1=s1;
	   }
	   public void run (){
		   while (true ){
			   s1.put(num++);
		      try{
			   		t=r.nextInt(2000);
				   Thread.sleep(t);
			   }catch(InterruptedException e){
				   e.printStackTrace();
			   } 
			  
		   }
	   
	   
	}  
}
class Output implements Runnable {
	private Storage st;
	private int x;
	Random r;
	Output(Storage st ){
		this.st=st;
		r=new Random();
	}
	public void run (){
		while (true){
			st.get();
		try{
			x=r.nextInt(2000);
			Thread.sleep(x);
		}catch(InterruptedException e){
			   e.printStackTrace();
		   } 
	}
		}
}

public class Th {
     public static void main (String [] args ){
    	
    	 Storage st= new Storage ();
    	 Input input=new Input(st);
    	 Output output =new Output(st);
    	 new Thread(input).start();
    	 new Thread(output).start();
    	
    	 
    	 
     }
	
	
	
}