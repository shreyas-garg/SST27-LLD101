public class ExpressShippingCost implements ShippingCostStrategy {
    @Override
    public double calculateCost(Shipment shipment) {
        return 80 + 8 * shipment.weightKg;
    }
}