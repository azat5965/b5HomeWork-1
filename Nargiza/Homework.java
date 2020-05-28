package CondinionalStms;


public class Homework {

	public boolean canDivide(int num1, int num2) {
		boolean result = num1 % num2 == 0;//if modyl ==0 divide without remainder
		return result;
		
	}
public static void main(String[] args) {
	

	 Homework hw = new Homework();
	 System.out.println(hw.canDivide(55,6));
		System.out.println(hw.canDivide(321,3));
		System.out.println(hw.canDivide(5,2));
	
	}
}

