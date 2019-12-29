package FryShak;

public class Beer extends Drink{
private final double price = 2.5;
private String name;

public Beer() {};

public Beer(String name) {
	this.name = name;
}

@Override
public double getPrice() {
	
	return price;
}

}
