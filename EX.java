
public class EX {
    public static void main (String [] args)
    {
    	StringBuffer  s = new StringBuffer ();
    	System.out.println("����ѧ���ɼ���");
    	s.append("1 ��һ ��;2 ���� Ů;3 ���� ��;");
    	System.out.println(s.toString());
    	System.out.println("���һ���µ�ѧ���ɼ�");
    	s.append("4 ���� Ů;");
    	System.out.println(s.toString());
    	System.out.println("�޸�ĳ��ѧ������Ϣ:");
    	String s1=s.toString();
    	int i=s1.indexOf("2");
    	
    	s.replace(i,i+7, "2 ���� ��;");
    	System.out.println(s);
    	System.out.println("ɾ��ĳ��ѧ����ѧ��:");
    	int j=s1.indexOf("2");
    	s.delete(j, j+7);
    	System.out.println(s);
    }
    
	
	
	
	
}
