package BehavioralPatterns.dependencyinjection.ex2;


class PaymentServiceFactory {
    PaymentService getPaymentService(String paymentType) {
        if (paymentType == null) {
            return null;
        }
        if (paymentType.equalsIgnoreCase("CASH")) {
            return new CashPaymentService();
        }
        if (paymentType.equalsIgnoreCase("CARD")) {
            return new CardPaymentService();
        }
        if (paymentType.equalsIgnoreCase("CONTACTLESS")) {
            return new ContactlessPayment();
        }
        return null;
    }
}
