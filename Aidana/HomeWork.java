package CondisionalStatemens;



public class HomeWork {
	

	public boolean canDivide(int number1, int number2) {
		if (number1%number2 == 0){
			return true;
		}
	else return false;
	}

    public void middleChars(String word) {
    	if  (word.length()%2==0){
    		 int firstPartlength = word.length()/2;
    		 String fisrtPart = word.substring(0,firstPartlength);
    		 String secondPart = word.substring(firstPartlength,-1);
    		int secondePartlength = secondPart.length();
    		String middleChars = " "+fisrtPart.charAt(firstPartlength-1)+secondPart.charAt(0);
    		return;
    	}else { 
    		int firstPartLength = word.length()/2;
    		String firstPart = word.substring(0,firstPartLength);
    		String secondPart = word.substring(firstPartLength-1);
    		int secondPartLength = secondPart.length();
    		String middleChars = " "+firstPart.charAt(firstPartLength);
    		return ;
    		
    		
    		
    		
    		
    	}
    }
}


