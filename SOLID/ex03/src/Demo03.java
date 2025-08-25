public class Demo03 {
    public static void main(String[] args) {
        ShippingCostCalculator calculator = new ShippingCostCalculator();
        System.out.println(calculator.cost(new Shipment("EXPRESS", 2.0)));
        System.out.println(calculator.cost(new Shipment("STANDARD", 3.0)));
        System.out.println(calculator.cost(new Shipment("OVERNIGHT", 1.5)));
    }
}
