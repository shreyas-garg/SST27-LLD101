

public class Demo01 {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        double total = orderService.checkout(100.0);
        EmailClient email = new EmailClient();
        email.send("a@shop.com", "Thanks! Your total is " + total);
    }
}
