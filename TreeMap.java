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
	private ArrayList communicationRecords;
	private TreeMap  singleRecord;
	public Telcomuser (String phonenumber){
		this.phonenumber=phonenumber;
		this.communicationRecords=new ArrayList();
		this.singleRecord=new TreeMap();
		
	}
	void generateComunicateRecord(){
		int recordnum=new Random().nextInt(10);
		for(int i=0;i<=recordnum;i++){ 
			this.callto = getCallToPhoneNumber();
			long	timestart=System.currentTimeMillis()-new Random().nextInt(36000000);
			long   timeend=timestart+6000+new Random ().nextInt(600000);
		this.singleRecord.put("主叫",this.phonenumber);
		this.singleRecord.put("开始时间", new Date(timestart));
		this.singleRecord.put("结束时间", new Date(timeend));
		this.singleRecord.put("被叫号码", this.callto);
		this.singleRecord.put("计费", this.accountFee(timestart, timeend));
		this.communicationRecords.add(this.singleRecord);
		
		
		
		}
	} 
	private  String getCallToPhoneNumber (){
		return "1380372"+ String.valueOf(new Random().nextInt(10))
		                 +String.valueOf(new Random().nextInt(10))
		                 +String.valueOf(new Random().nextInt(10))
		                 +String.valueOf(new Random().nextInt(10));
	}
	private String accountFee(long timestart,long timeend){
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
		
		Iterator itRecords =this.communicationRecords.iterator();
		while(itRecords.hasNext()){
			System.out.println("-----------------------");
			this.singleRecord=((TreeMap)itRecords.next());
			Set entrySet =this.singleRecord.entrySet();
			Iterator itEntry = entrySet.iterator();
			while(itEntry.hasNext()){
				Map.Entry entry = (Map.Entry)itEntry.next();
				Object key =entry.getKey();
			    Object value =entry.getValue();
			    System.out.println(key+":"+value);
			}
		}
}

 }














