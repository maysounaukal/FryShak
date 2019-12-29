package FryShak;

import java.util.Arrays;

public class Order {
	private Orderable[] order = new Orderable[0];
	private static int orderCount = 0;// het aantal orders
	{
		orderCount++;
	}

	

	public double CalculateTotalPrice() {
		double sum = 0;
		for(Orderable el: order) {
			sum += el.getPrice();
		}

		return sum;

	}



	//Put everything in fryer

	public void fryOrder() {
		
  for(Orderable el: order) {
	  
	  if(el instanceof Fryable) {
		  ((Fryable) el).Fry();
		
	  }
  }
		

	}



	public static int getOrderNumber() {

		return orderCount;

	}
	
	public void addOrder(Orderable orderable) {// we zijn hier dat geen [] bij orderable toegevoegd hebben
		 order = Arrays.copyOf(order,order.length + 1);
		 order[order.length - 1] = orderable;
		
	}



	@Override
	public String toString() {
		return "Order [order=" + Arrays.toString(order) + ", orderCount=" + orderCount + "]";
	}
	
}
