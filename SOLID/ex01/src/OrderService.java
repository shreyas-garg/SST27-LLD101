public class OrderService {
    private final double taxRate = 0.18;

    double totalWithTax(double subtotal) {
        return subtotal + subtotal * taxRate;
    }

    double checkout(double subtotal) {
        double total = totalWithTax(subtotal);
        System.out.println("Order stored (pretend DB).");
        return total;
    }
}