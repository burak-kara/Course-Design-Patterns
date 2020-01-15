package BehavioralPatterns.dependencyinjection.ex2;

import java.util.ArrayList;
import java.util.List;

class Cart {
    private List<Product> productList = new ArrayList<>();
    private PaymentService paymentService;

    Cart(PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("PaymentService is set to " + paymentService.getClass().getSimpleName().toUpperCase());

    }

    void setPaymentService(PaymentService paymentService) {
        System.out.println("PaymentService is set to " + paymentService.getClass().getSimpleName().toUpperCase());
        this.paymentService = paymentService;
    }

    void addProductToCart(Product product) {
        productList.add(product);
    }

    void buy() {
        productList.forEach(paymentService::pay);
        clear();
    }

    private void clear() {
        System.out.println("Cart is cleared");
        productList.clear();
        System.out.println();
    }
}