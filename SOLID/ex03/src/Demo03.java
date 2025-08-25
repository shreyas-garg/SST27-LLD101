public class Demo03 {
    public static void main(String[] args) {
        ShippingCostCalculator calculator = new ShippingCostCalculator();
        System.out.println(calculator.cost(new Shipment("EXPRESS", 2.0)));
    }
}
