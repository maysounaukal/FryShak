package FryShak;

public class FrayMain {

	public static void main(String[] args) {
		Fryshack jammies = new Fryshack("Jammies");

		jammies.makeOrders();

		

		System.out.println(Order.getOrderNumber());

	}

}
