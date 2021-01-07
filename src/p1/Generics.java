


/**
 * 
@author saidJhofiani
 *
 */

package p1;

public class Generics {

    /**
 * @param args the command line arguments
 */
public static void main(String[] args) {
    
	double winningP = 0;
	
	//Pair<String,Double> obj = new Pair<>("Microsoft", 35.01);  
    
    Triple<String, Integer, Integer> ob1 = new Triple<>("Tiger",8,2);
    Triple<String, Integer, Integer> ob2 = new Triple<>("Bears",9,1);
    Triple<String, Integer, Integer> ob3 = new Triple<>("The jackhammers",8,1);
    Triple<String, Integer, Integer> ob4 = new Triple<>("The Movie Hoppers",7,8);
    Triple<String, Integer, Integer> ob5 = new Triple<>("The price is right",1,2);
    
    Triple<String, Integer, Integer>[] holdings = new Triple[5];
    
    holdings[0] = ob1;
    holdings[1] = ob2;
    holdings[2] = ob3;
    holdings[3] = ob4;
    holdings[4] = ob5;
    
    
    Pair[] holdings2 = new Pair[5];
    
    for(int x = 0; x < holdings.length; x++){
    	 Pair<String, Double> obtemp = new Pair<>(holdings[x].getfirst(), ((double)holdings[x].getSecond()/holdings[x].getthird()) );
    	holdings2[x] = obtemp;
    }
    
    for(int i = 0; i < holdings2.length; i++){
    	if(winningP < (double)holdings2[i].getSecond()){
    		winningP = (double)holdings2[i].getSecond();
    	}
    }
    
    for(int j = 0; j < holdings2.length;j++)
    	{
    		System.out.println(holdings2[j].getFirst() + "\t" + holdings2[j].getSecond());
    	}
    		System.out.println("The highest winning% is " + winningP);

    }
}

