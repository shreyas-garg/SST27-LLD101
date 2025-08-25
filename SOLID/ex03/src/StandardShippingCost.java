public class StandardShippingCost implements ShippingCostStrategy {
    @Override
    public double calculateCost(Shipment shipment) {
        return 50 + 5 * shipment.weightKg;
    }
}