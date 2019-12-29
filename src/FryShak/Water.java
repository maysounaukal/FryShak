package FryShak;

public class Water extends Drink{
private final double price = 1.5;
private String name;

public Water(String water) {
	this.name = water;
}
public Water() {
	
}
public void setName(String name){
	this.name = name;
}
public String getName() {
	return name;
}

@Override
public double getPrice() {
	
	return price;
}


}
