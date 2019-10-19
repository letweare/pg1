class MyThread extends Thread {
	public MyThread (String Name ){
		
		super(Name);
	} 
	public void  run ()
	{
		System.out.println(this.getName());
	}
}

public  class Name {
	public static void main (String [] args){
		new MyThread("n1").start();
		new MyThread("n2").start();
	}
}