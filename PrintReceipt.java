public class PrintReceipt{
	
	public static void main(String[] args){
	String item1 = "Computer";
	String item2 = "Headphones";
	int value1 = 980;
	int value2 = 40;

	System.out.println("Receipt");
	System.out.println(item1 + ":" + value1 + " dollars");
	System.out.println(item2 + ":" + value2 + " dollars");
	System.out.println("------------------");
	int total = value1+value2;
	System.out.println("Total: " + total + " dollars");
		
	}
}
