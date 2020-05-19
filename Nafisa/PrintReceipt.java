public class PrintReceipt {
	public static void main(String[] args) {
		String item1 = "Computer";
		String item2 = "Headphones";
		int price1 = 980;
		int price2 = 40;
		int total = price1+price2;

		System.out.println("     Receipt");
		System.out.println(item1+":"+price1+" dollars");
		System.out.println(item2+":"+price2+" dollars");
		System.out.println("---------------------");
		System.out.println("Total: "+ total+ " dollars");


	}
}