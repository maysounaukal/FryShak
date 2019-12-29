package FryShak;

import java.util.Random;

public class Fryshack {
	private String name;



	public Fryshack(String string) {

		this.name = string;

	}



	public String getName() {

		return name;

	}



	public void makeOrders() {

		makeOrderOne();

		makeOrderTwo();

		makeOrderTree();

		makeOrderFour();

	}



	// make an order by making Fries, Sauce and Drink Objects and setting them with

	// there Setters

	private void makeOrderOne() {
  Fries fries1 = new Fries();
  fries1.setSize(FrySizes.BIG);
  Fries fries2 = new Fries();
  fries2.setSize(FrySizes.MEDIUM);
  Sauce sauce1 = new Sauce();
  sauce1.setName("maynaise saus");
  Sauce sauce2 = new Sauce();
  sauce2.setName("ketchup");
  
 Water water = new Water();
 water.setName("water");
 Water water1 = new Water();
 water1.setName("soda");
 
 
 Order order1 = new Order();
 
 order1.addOrder(fries1);
 order1.addOrder(fries2);
 order1.addOrder(sauce1);
 order1.addOrder(sauce2);
 order1.addOrder(water);
 order1.addOrder(water1);
 order1.fryOrder();
 
  
System.out.println(order1.CalculateTotalPrice());

	}



	// make an order by making new Fries, Sauce and Drink Objects and setting them

	// with there Constructors

	private void makeOrderTwo() {
Fries fries1 = new Fries(FrySizes.Family);
Sauce sauce1 = new Sauce("maynaise");
Sauce sauce2 = new Sauce("maynaise");
Sauce sauce3 = new Sauce("ketchup");
Water water = new Water("water");
Soda soda1 = new Soda("soda");
Soda soda2 = new Soda("soda");
Soda soda3 = new Soda("soda");

Order order2 = new Order();
order2.addOrder(fries1);
order2.addOrder(sauce1);
order2.addOrder(sauce2);
order2.addOrder(sauce3);
order2.addOrder(sauce3);
order2.addOrder(water);
order2.addOrder(soda1);
order2.addOrder(soda2);
order2.addOrder(soda3);

order2.fryOrder();


    System.out.println(order2.CalculateTotalPrice());

	}



	// make an onlineOrder with a Orderable array

	private void makeOrderTree() {
  Orderable[] order = new Orderable[] {new Fries(FrySizes.BIG), new Sauce("mayonaise"), new Beer("bier")};
  Order order3 = new Order();
  
	order3.fryOrder();

		System.out.println(order3.CalculateTotalPrice());



	};



	// make an your own Order

	private void makeOrderFour() {
		Order order4 = new Order();
		//wij hebben 4 SIZES VZN FRIES EN 2 SOORTEN VAN MAYONAISE EN WATER,SODA,BEER = 9.
		
	boolean flag = false;// ik heb hier verondersteld dat wij nog niet meer of gelijk aan 10 euro kopen
	while(flag == false) {
		Random rand = new Random();
		int choice = rand.nextInt(9);
		switch(choice) {
		case 0 : order4.addOrder(new Fries(FrySizes.BIG));break;
		case 1 : order4.addOrder(new Fries(FrySizes.Family));break;
		case 2 : order4.addOrder(new Fries(FrySizes.MEDIUM));break;
		case 3 : order4.addOrder(new Fries(FrySizes.SMALL));break;
		case 4 : order4.addOrder(new Sauce("mayonaise")); break;
		case 5 : order4.addOrder(new Sauce("ketchup"));break;
		case 6 : order4.addOrder(new Water()); break;
		case 7 : order4.addOrder(new Soda());break;
		case 8 : order4.addOrder(new Beer());break;
		}
		if(order4.CalculateTotalPrice() >= 10) {
			flag = true;// wij hebben gekocht met gelijk aan en meer dan 10 euro
		}
		order4.fryOrder();
		System.out.println(order4.CalculateTotalPrice());
	}
		
		



	

		



	}
}
