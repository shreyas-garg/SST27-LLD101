public class OvernightShippingCost implements ShippingCostStrategy {
    @Override
    public double calculateCost(Shipment shipment) {
        return 120 + 10 * shipment.weightKg;
    }
}