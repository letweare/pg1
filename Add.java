public class  Add extends Thread {
	 private  int stratnum ;
	 public static int sum;
	 public Add (int startnum){
		 this.stratnum=startnum;
	 }
	 public static synchronized void add ( int num){
		 sum=sum+num;
	 } 
	 public void run (){
		 for (int i=0;i<10;i++){
			 sum=stratnum+i;
		 }
		 add(sum);
	 }
	public static void main (String [] args )throws Exception{
    Thread [] threadlist =new Thread[10];
    for(int i=0;i<10;i++){
    	threadlist[i]=new Add (10*i+1);
    	threadlist[i].start();
    }
     for (int i=0;i<10;i++){
    	 threadlist[i].join();
     }
     System.out.println("½á¹ûÊÇ: "+sum);
     
     
	}
}
