import com.example.orders.*;
import java.util.List;

public class TryIt {
    public static void main(String[] args) {
        OrderLine l1 = new OrderLine.Builder().sku("A").quantity(1).unitPriceCents(200).build();
        OrderLine l2 = new OrderLine.Builder().sku("B").quantity(3).unitPriceCents(100).build();
        Order o = new Order.Builder("o2", "a@b.com")
            .addLine(l1)
            .addLine(l2)
            .discountPercent(10)
            .build();
        System.out.println("Before: " + o.totalAfterDiscount());
        // l1.setQuantity(999); // Not allowed: OrderLine is now immutable
        System.out.println("After:  " + o.totalAfterDiscount());
        System.out.println("=> In the solution, totals remain stable due to defensive copies.");
    }
}
