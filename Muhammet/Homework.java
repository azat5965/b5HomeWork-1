
public class Homework {
	public boolean canDivide(int firstNum, int secondNum) {
		boolean result = firstNum%secondNum == 0;
		return result;
	}
	
	
	public static void main(String[] args) {
		Homework hw = new Homework();
		
//		Scanner sc = new Scanner(System.in);
//		
//		int firstNum = sc.nextInt();
//		int secondNum = sc.nextInt();
//		
//		System.out.println(hw.canDivide(firstNum, secondNum));
		
		System.out.println(hw.canDivide(55,6));
		System.out.println(hw.canDivide(321,3));
		System.out.println(hw.canDivide(5,2));
	}


}
