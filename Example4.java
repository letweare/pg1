class TicketWindow extends  Thread{ 
	private int tickets = 100;
	public void run (){
		while (true )
		{
			if(tickets >0 ){
				
				Thread th =Thread.currentThread();
				String th_name = th.getName();
				System.out.println(th_name +"���ڷ���"+tickets--+"��Ʊ");
			}
		}
	}
	
}



public class Example4  {
	 public static void  main (String [] args){
    new TicketWindow().start();
    new TicketWindow().start();
    new TicketWindow().start();
    new TicketWindow().start();
	 }
}