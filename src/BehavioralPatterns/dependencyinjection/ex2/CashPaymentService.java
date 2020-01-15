package BehavioralPatterns.dependencyinjection.ex2;

public class CashPaymentService implements PaymentService {
    @Override
    public void pay(Product product) {
        System.out.println(product.getName() + " payed with CASH of " + product.getPrice());
    }
}
