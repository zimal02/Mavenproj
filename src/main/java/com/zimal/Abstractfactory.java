package com.zimal;
public class Abstractfactory {
//Factory → creates one type of object
//Abstract Factory → creates families of related objects,
    // Payment interface → defines payment behavior
    interface Payment {
        void pay(); // method for making payment
    }

    //Refund interface → defines refund behavior
    interface Refund {
        void refund(); // method for refund
    }

    //JazzCash Payment implementation
    static class JazzCashPayment implements Payment {
        public void pay() {
            System.out.println("Payment done via JazzCash"); // print message
        }
    }

    //azzCash Refund implementation
    static class JazzCashRefund implements Refund {
        public void refund() {
            System.out.println("Refund via JazzCash"); // print message
        }
    }

    //EasyPaisa Payment implementation
    static class EasyPaisaPayment implements Payment {
        public void pay() {
            System.out.println("Payment done via EasyPaisa"); // print message
        }
    }

    // EasyPaisa Refund implementation
    static class EasyPaisaRefund implements Refund {
        public void refund() {
            System.out.println("Refund via EasyPaisa"); // print message
        }
    }

    //Abstract Factory → common factory interface
    interface PaymentFactory {
        Payment createPayment(); // method to create payment object
        Refund createRefund();   // method to create refund object
    }

    //JazzCash Factory → creates JazzCash family objects
    static class JazzCashFactory implements PaymentFactory {

        public Payment createPayment() {
            return new JazzCashPayment(); // return JazzCash payment object
        }

        public Refund createRefund() {
            return new JazzCashRefund(); // return JazzCash refund object
        }
    }

    //EasyPaisa Factory → creates EasyPaisa family objects
    static class EasyPaisaFactory implements PaymentFactory {

        public Payment createPayment() {
            return new EasyPaisaPayment(); // return EasyPaisa payment object
        }

        public Refund createRefund() {
            return new EasyPaisaRefund(); // return EasyPaisa refund object
        }
    }

    //Main method → execution starts here
    public static void main(String[] args) {

        PaymentFactory factory; // reference of factory (not specific type)

        String type = "JAZZCASH"; // choose payment system

        // decide which factory to use
        if (type.equalsIgnoreCase("JAZZCASH")) {
            factory = new JazzCashFactory(); // create JazzCash factory
        } else {
            factory = new EasyPaisaFactory(); // create EasyPaisa factory
        }

        // create objects using factory
        Payment payment = factory.createPayment(); // get payment object
        Refund refund = factory.createRefund();    // get refund object

        payment.pay();     // call payment method
        refund.refund();   // call refund method
    }
}