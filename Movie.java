
public class Movie {
	// ������һ����Ӱ�࣬������ ��Ӱ���ֺͼ۸��з������õ�ӰƱ�۸�͵õ���ӰƱ�۸�
	public static final int CHILDRENS=2;//childrens
	public static final int REGULAR=0;//regular
	public static final int NEW_RELEASE=1;//new__release
	
	private String _title;
	private Price _price ;
	
	public Movie(String title,Price priceCode){
		
		_title=title;
		_price =priceCode;
		
	}
	
	public int getPriceCode(){
		return _price.getPriceCode();
	}
	
	public void setPriceCode(int arg){
		switch(arg){
		
		case REGULAR:
			 _price=new RegularPrice();
		case CHILDRENS:
			 _price=new ChildrensPrice();
		case NEW_RELEASE:
			 _price=new NewReleasePrice();
			 
		default:
			throw new IllegalArgumentException("Incorrect Price Code");
		}
		
		
	}
	
	public String getTitle(){
		return _title;
	}
	
    double getCharge(int daysRented){
    	
    	return _price.getCharge(daysRented);
    }
		//
		
    
   
}
