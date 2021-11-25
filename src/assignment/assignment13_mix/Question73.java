package assignment.assignment13_mix;

public class Question73 {
	
    public static void main(String[] args) {
     
    	String[][] test_money = { {"mark","11.0"},{"shekel","5.0"} };
    	String[][] test_convert = { {"mark","0.6"},{"shekel","100"} };
     
    	double res = convertC(test_money,test_convert);
    	System.out.print(res);
    }

	public static  double convertC(String[][] money,String[][] convertionRate) {
		
	    double currency;
	    double rate;
	    double sum=0;
	    
	    for (int i=0;i<money.length;i++){
	      currency=Double.parseDouble(money[i][1]);
	      if (convertionRate[i][0].equals(money[i][0])){
	    	  rate= Double.parseDouble(convertionRate[i][1]);
	    	  sum=sum+currency*rate;
	      }
	    }
	    
	    return sum;
	  } 
	}
