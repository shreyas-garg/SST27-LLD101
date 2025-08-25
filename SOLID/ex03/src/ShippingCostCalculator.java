import java.util.HashMap;
import java.util.Map;

public class ShippingCostCalculator {
    private final Map<String, ShippingCostStrategy> strategies = new HashMap<>();

    public ShippingCostCalculator() {
        strategies.put("STANDARD", new StandardShippingCost());
        strategies.put("EXPRESS", new ExpressShippingCost());
        strategies.put("OVERNIGHT", new OvernightShippingCost());
    }

    public double cost(Shipment s) {
        ShippingCostStrategy strategy = strategies.get(s.type);
        if (strategy == null) {
            throw new IllegalArgumentException("Unknown type: " + s.type);
        }
        return strategy.calculateCost(s);
    }
}
