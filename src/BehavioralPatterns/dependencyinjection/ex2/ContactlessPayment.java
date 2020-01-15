package BehavioralPatterns.dependencyinjection.ex2;

public class ContactlessPayment implements PaymentService {
    @Override
    public void pay(Product product) {
        System.out.println(product.getName() + " payed with CONTACTLESS CARD / MOBILE DEVICE of " + product.getPrice());
    }
}
