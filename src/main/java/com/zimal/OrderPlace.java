package com.zimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OrderPlace {
    private static final Logger logger = LogManager.getLogger(OrderPlace.class);

    // Utility method to mask sensitive names
    private String maskString(String input) {
        if (input == null || input.length() <= 2) return "**"; // too short, mask completely
        return input.charAt(0) + "**" + input.charAt(input.length() - 1); // keep first & last char
    }

    // Utility method to mask numeric IDs
    private String maskId(int id) {
        String idStr = String.valueOf(id);
        return "****" + idStr.substring(Math.max(0, idStr.length() - 2)); // show only last 2 digits
    }

    // Main order service method
    public void orderservices(String name, int productid) {
        String maskedName = maskString(name);
        String maskedProductId = maskId(productid);

        logger.info(maskedName + " placed your order");
        logger.debug(maskedName + " checked product availability " + maskedProductId);

        boolean instock = true;

        if (!instock) {
            logger.warn("...out of stock..." + maskedProductId);
            return;
        }

        logger.info("Add to Cart");

        try {
            logger.info("Processing payment");
            boolean paymentSuccess = true;

            if (paymentSuccess) {
                logger.info("Your order is placed");
            } else {
                logger.info("Payment failed");
            }

        } catch (Exception e) {
            logger.error("Unexpected error occurred: " + e);
            logger.trace("Track every execution");
        }
    }

    // Main method to test orders
    public static void main(String[] args) {
        OrderPlace orderPlace = new OrderPlace();

        // Test orders
        orderPlace.orderservices("Alice", 12345);
        orderPlace.orderservices("Bob", 7);
        orderPlace.orderservices("Eve", 987654);

        System.out.println("Orders processed. Check the logs in logs/order.log");
    }
}