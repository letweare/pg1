class Single{
	private static Single ICE=new Single();
	private Single () {};
	public static Single getICE() {
		return ICE;
    }
}  
class Ep {
	public static void main (String [] args){
		Single s1=Single.getICE();
		Single s2=Single.getICE();
		System.out.println(s1==s2);
	}
}