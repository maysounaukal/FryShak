package FryShak;

public class Soda extends Drink{
private final double price  = 2;
private String name;


public Soda(String name) {
	this.name = name;
}

public Soda() {
	// TODO Auto-generated constructor stub
}

@Override
public double getPrice() {
	
	return price;
}
}
