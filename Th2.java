
public class Th2 {
  public static void main (String [] args){ 
	  
	  StringBuffer s=new StringBuffer();
	  System.out.println("现有学生成绩：");
  	  s.append("1 王一 男;2 王二 女;3 王三 男;");
	  System.out.println("--添加—--");
	 s=add(s);
	 System.out.println("--删除--");
	 s=delete(s);
	 System.out.println("--修改--");
	 s=alter(s);
	 
  }

public  static StringBuffer add(StringBuffer s) {
	System.out.println("添加一个新的学生成绩");
	s.append("4 王四 女;");
	System.out.println(s.toString());
	
	return s;
}
public static StringBuffer delete(StringBuffer s){
	System.out.println("修改某个学生的信息:");
	String s1=s.toString();
	int i=s1.indexOf("2");
	
	s.replace(i,i+7, "2 王二 男;");
	System.out.println(s);
	
	return s;
}
public static StringBuffer alter(StringBuffer s){
	String s1=s.toString();
	System.out.println("删除某个学生的学号:");
	int j=s1.indexOf("2");
	s.delete(j, j+7);
	System.out.println(s);
	
	
	return s;
}


}
