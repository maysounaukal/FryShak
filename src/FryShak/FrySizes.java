package FryShak;

public enum FrySizes {SMALL(1.5),MEDIUM(2.5),BIG(3),Family(4.5);
	private double price;
	private FrySizes(double price) {//belangrijk om constructor te initaliseren
		price = price;
	}
	double getPrice() {
		return price;
	}
	
	public String toString() {
		return name()+"("+ price + ")";
	}

}
