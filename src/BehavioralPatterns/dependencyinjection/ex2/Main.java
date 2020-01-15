package BehavioralPatterns.dependencyinjection.ex2;

public class Main {
    public static void main(String[] args) {
        PaymentServiceFactory psf = new PaymentServiceFactory();
        PaymentService paymentService = psf.getPaymentService("CARD");
        Cart cart = new Cart(paymentService);
        Product p1 = new Product("Computer", 5000);
        Product p2 = new Product("Mobile Phone", 10000);
        cart.addProductToCart(p1);
        cart.addProductToCart(p2);
        cart.buy();

        cart.setPaymentService(psf.getPaymentService("CASH"));
        cart.addProductToCart(p1);
        cart.buy();

    }
}
