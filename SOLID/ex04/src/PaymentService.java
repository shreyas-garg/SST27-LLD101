import java.util.HashMap;
import java.util.Map;

public class PaymentService {
    private final Map<String, PaymentProvider> providers = new HashMap<>();

    public PaymentService() {
        providers.put("CARD", new CardPaymentProvider());
        providers.put("UPI", new UpiPaymentProvider());
        providers.put("WALLET", new WalletPaymentProvider());
    }

    public String pay(Payment p) {
        PaymentProvider provider = providers.get(p.provider);
        if (provider == null) throw new RuntimeException("No provider");
        return provider.pay(p);
    }
}
