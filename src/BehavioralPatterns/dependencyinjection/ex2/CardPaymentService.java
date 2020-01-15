package BehavioralPatterns.dependencyinjection.ex2;

public class CardPaymentService implements PaymentService {
    @Override
    public void pay(Product product) {
        System.out.println(product.getName() + " payed with CREDIT CARD of " + product.getPrice());
    }
}
