package FryShak;

public class Sauce implements Orderable{
	private final double  price = 0.8;
	private String name;
	
	
	

	public Sauce(String name) {
		this.name = name;
	}




	public Sauce() {
	
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	@Override
	public double getPrice() {
		
		return price;
	}

}
