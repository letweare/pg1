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
	private StringBuffer communicationRecords;
	public Telcomuser (String phonenumber){
		this.phonenumber=phonenumber;
		this.communicationRecords=new StringBuffer();
		
	}
	void generateComunicateRecord(){
		int recordnum=new Random().nextInt(10);
		for(int i=0;i<=recordnum;i++){ 
		this.callto = getCallToPhoneNumber();
		long	timestart=System.currentTimeMillis()-new Random().nextInt(36000000);
		long   timeend=timestart+6000+new Random ().nextInt(600000);
		this.communicationRecords.append(this.phonenumber+","+timestart+","+timeend+","+this.callto+";");
		}
	} 
	private  String getCallToPhoneNumber (){
		return "1380372"+ String.valueOf(new Random().nextInt(10))
		                 +String.valueOf(new Random().nextInt(10))
		                 +String.valueOf(new Random().nextInt(10))
		                 +String.valueOf(new Random().nextInt(10));
	}
	private String accountFee(long timestart,long timeend){
		
		double feePerMinute=0.2;
		int minutes =Math.round((timeend-timestart)/60000);
		double feeTotal =feePerMinute*minutes;
		return String.format("%.4f", feeTotal);
	}
	
	void printDetails(){
		String allRecords=this.communicationRecords.toString();
		String [] recordarry =allRecords.split(";");
		for (int i=0;i<recordarry.length;i++){
			String [] recordField =recordarry[i].split(",");
			System.out.println("主叫，"+recordField[0]);
			System.out.println("被叫，"+recordField[3]);
			System.out.println("通话开始时间"+new Date(Long.parseLong(recordField[1])));
			System.out.println("通话结束时间"+new Date(Long.parseLong(recordField[2])));
			System.out.println("计费："
					+accountFee(Long.parseLong(recordField[1]),Long.parseLong(recordField[2]))
					+"元");
		}
	}
	
	
}
















