import java.util.*;


import  Boss.*;
import gongsi.*;
import xm.*;
public class Tel {
   
	  public static void main (String [] args){
		  Telcomuser telcomuser= new Telcomuser("13800138000");
		  telcomuser .generateComunicateRecord();
		  telcomuser .printDetails();
	  }
}
class Telcomuser {
	private String phonenumber;
	private String callto;
	private HashSet calltonumber;
	private ArrayList calltonumber1;
	private Vector communicationRecords;
	
	public Telcomuser (String phonenumber){
		this.phonenumber=phonenumber;
		this.communicationRecords=new Vector();
		this.calltonumber=new HashSet();
		this.calltonumber1=new ArrayList();
	}
	@SuppressWarnings("unchecked")
	void generateComunicateRecord(){
		int recordnum=new Random().nextInt(10);
		for(int i=0;i<=recordnum;i++){ 
		this.callto = getCallToPhoneNumber();
		this.calltonumber.add(this.callto);
		this.calltonumber1.add(this.callto);
		long	timestart=System.currentTimeMillis()-new Random().nextInt(36000000);
		long   timeend=timestart+6000+new Random ().nextInt(600000);
		this.communicationRecords.add(this.phonenumber+","+timestart+","+timeend+","+this.callto);
		}
	} 
	private  String getCallToPhoneNumber (){
		return "1380372"+ String.valueOf(new Random().nextInt(10))
		                 +String.valueOf(new Random().nextInt(10))
		                 +String.valueOf(new Random().nextInt(10))
		                 +String.valueOf(new Random().nextInt(10));
	}
	public String accountFee(long timestart,long timeend){
		String  brandName=Xmu.getBrandName();
		Gongsi g ;
		g=Ceo.produce(brandName);
		double x=g.fee();
		double feePerMinute=x;
		int minutes =Math.round((timeend-timestart)/60000);
		double feeTotal =feePerMinute*minutes;
		return String.format("%.4f", feeTotal);
	}
	
	void printDetails(){  
	
	/*int arrayListSize =this.communicationRecords.size();
		for (int i=0;i<arrayListSize;i++){ 
			System.out.println("=================");
	        String  []  recordField = ((String) this .communicationRecords.get(i)).split(",");
			System.out.println("主叫，"+recordField[0]);
			System.out.println("被叫，"+recordField[3]);
			System.out.println("通话开始时间"+new Date(Long.parseLong(recordField[1])));
			System.out.println("通话结束时间"+new Date(Long.parseLong(recordField[2])));
			System.out.println("计费："
					+accountFee(Long.parseLong(recordField[1]),Long.parseLong(recordField[2]))
					+"元");
		
		}*/
		
		Iterator it =this.calltonumber.iterator();
		Enumeration en = this.communicationRecords.elements();
		/*while (en.hasMoreElements()){
			System.out.println("==============");
			Object c = en.nextElement();
			String [] recordField =((String)c).split(",");
			System.out.println("主叫，"+recordField[0]);
			System.out.println("被叫，"+recordField[3]);
			System.out.println("通话开始时间"+new Date(Long.parseLong(recordField[1])));
			System.out.println("通话结束时间"+new Date(Long.parseLong(recordField[2])));
			System.out.println("计费："
					+accountFee(Long.parseLong(recordField[1]),Long.parseLong(recordField[2]))
					+"元");
			
		}*/
		
		
		System.out.println("*************************");
		for (int i=0;i<this.calltonumber1.size();i++){
			System.out.println(calltonumber1.get(i));
		}
		
	
		System.out.println("-------------------");
		while(it.hasNext()){
			
			Object obj= it.next();
			System.out.println(obj);	
		}
		
		
	}
	
	
}
















