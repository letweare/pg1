
public abstract class Price {
		abstract int getPriceCode();
		abstract double getCharge(int daysRented);
		
		 int getFrequentRenterPoints(int daysRented){
		    	if((getPriceCode()==Movie.NEW_RELEASE)&&daysRented>2)
		    		return 3;
		    	else
		    		return 2;
		    }
}

class ChildrensPrice extends Price{
	
	int getPriceCode(){
		
		return Movie.CHILDRENS;
	}
    double getCharge(int daysRented){
		
		double result=2.5;
		 if(daysRented>3)
			  result+=(daysRented-3)*2.5;
		 return result;
	}
	
	
}

class NewReleasePrice extends Price{
	
	int getPriceCode(){
		return Movie.NEW_RELEASE;
	}
	
    double getCharge(int daysRented){
		
		return daysRented*3;
	}
    
    int getFrequentRenterPoints(int daysRented){
    	
    	return (daysRented>2)?3:2;
    }
}

class RegularPrice extends Price{
	int getPriceCode(){
		return Movie.REGULAR;
	}
	
	double getCharge(int daysRented){
		
		double result=3;
		 if(daysRented>3)
			  result+=(daysRented-3)*2.5;
		 return result;
	}
}
