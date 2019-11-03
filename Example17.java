class Storage{
	private int [] cells = new int  [10];
	private int inpos,outpos;
	public void put (int num){
		cells[inpos]=num;
		System.out.println("在cells["+inpos+"]中放入数据---"+cells[inpos]);
		inpos++;
		if(inpos==cells.length)
			inpos=0;
	}
	public void get (){
		@SuppressWarnings("unused")
		int data = cells[outpos];
		System.out.println("在cells["+inpos+"]中取出数据---"+cells[inpos]);
		outpos++;
		if(outpos==cells.length)
			outpos=0;
	}
}   
class Input implements Runnable {
	   private Storage st;
	   private int num;
	   Input (Storage st){
		   this.st=st;
	   }
	   public void run (){
		   while (true){
			   st.put(num++);
		   }
	   }
}
class Output implements Runnable {
	private Storage st;
	
	Output (Storage st ){
		this.st =st ;
	}   
	public void run (){
		while (true ){
			st.get();
		}
	}
}


public class Example17 {
	 public static void main (String [] args){
     Storage st =new Storage ();
     Input input =new Input (st);
     Output output =new Output(st);
     new Thread(input).start();
     new Thread(output).start();
}
}








