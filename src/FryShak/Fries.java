package FryShak;

public class Fries  implements Fryable,Orderable{
	private FrySizes size;
	private double price;
	public double portionCount = 0;
	
	public Fries(){};
	
	public Fries(FrySizes size) {
		this.size = size;
	}

	{
		portionCount++;
	}
	
	public void calculatePrice() {
		price += size.getPrice();
	}
	
	

	public FrySizes getSize() {
		return size;
	}



	public void setSize(FrySizes size) {
		this.size = size;
	}



	public double getPortionCount() {
		return portionCount;
	}



	public void setPortionCount(double portionCount) {
		this.portionCount = portionCount;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	@Override
	public double getPrice() {
		
		return price;
	}

	@Override
	public void Fry() {
		System.out.println("Smijt een" +" " +  size.name() +" " +  "portie in de frietpot");
		
	}



	@Override
	public String toString() {
		return "Fries [size=" + size + ", price=" + price + ", portionCount=" + portionCount + "]";
	}
	

}
