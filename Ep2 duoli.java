class Sex{
 private String title;
 private static Sex manSex = new Sex("Man");
 private static Sex womenSex = new Sex("Women");
 private Sex(String title){
 this.title = title;
 }
 public static Sex getInstance(int choose){
 switch (choose) {
 case Choose.MAN:
 return manSex;
 default:
 return womenSex;
 }
 }
 public String getTitle(){
 return title;
 }
}
interface Choose{
 public int MAN = 1;
 public int WOMEN = 2;
}
public class Ep2{
 public static void main(String args[]){
 Sex sex = Sex.getInstance(Choose.MAN);
 System.out.println(sex.getTitle());
 Sex sex2 = Sex.getInstance(Choose.WOMEN);
 System.out.println(sex2.getTitle());
 }
}
