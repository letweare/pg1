
public class Th2 {
  public static void main (String [] args){ 
	  
	  StringBuffer s=new StringBuffer();
	  System.out.println("����ѧ���ɼ���");
  	  s.append("1 ��һ ��;2 ���� Ů;3 ���� ��;");
	  System.out.println("--��ӡ�--");
	 s=add(s);
	 System.out.println("--ɾ��--");
	 s=delete(s);
	 System.out.println("--�޸�--");
	 s=alter(s);
	 
  }

public  static StringBuffer add(StringBuffer s) {
	System.out.println("���һ���µ�ѧ���ɼ�");
	s.append("4 ���� Ů;");
	System.out.println(s.toString());
	
	return s;
}
public static StringBuffer delete(StringBuffer s){
	System.out.println("�޸�ĳ��ѧ������Ϣ:");
	String s1=s.toString();
	int i=s1.indexOf("2");
	
	s.replace(i,i+7, "2 ���� ��;");
	System.out.println(s);
	
	return s;
}
public static StringBuffer alter(StringBuffer s){
	String s1=s.toString();
	System.out.println("ɾ��ĳ��ѧ����ѧ��:");
	int j=s1.indexOf("2");
	s.delete(j, j+7);
	System.out.println(s);
	
	
	return s;
}


}
