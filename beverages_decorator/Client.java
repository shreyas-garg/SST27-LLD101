package beverages_decorator;

public class Client {

	public static void main(String[] args) {
		

		
		Beverage coffee = new Cappuccino();
		System.out.println("Cappuccino cost: " + coffee.cost());

		// Add milk using decorator
		Beverage milkCoffee = new MilkDecorator(coffee);
		System.out.println("Cappuccino with milk cost: " + milkCoffee.cost());

		Beverage latte = new Latte();
		System.out.println("Latte cost: " + latte.cost());

		Beverage milkLatte = new MilkDecorator(latte);
		System.out.println("Latte with milk cost: " + milkLatte.cost());
	}

}