package com.zimal; // Package declaration. Organizes the class in the 'com.zimal' package.

import org.apache.logging.log4j.LogManager; // Imports LogManager, used to create Logger objects.
import org.apache.logging.log4j.Logger;     // Imports Logger, used to log messages.

public class UserLogger { // Main class to demonstrate logging with masking

    private static final Logger logger = LogManager.getLogger(UserLogger.class);
    // Creates a Logger object for this class. Used to log info, debug, warn, error messages.

    // Mask name: show first and last character only
    private String maskName(String name) {
        if (name == null || name.length() <= 2) return "**";
        // If name is null or too short, mask completely
        return name.charAt(0) + "**" + name.charAt(name.length() - 1);
        // Otherwise, keep first & last character, mask the middle
    }

    // Mask password completely
    private String maskPassword(String password) {
        return password == null ? "**" : "********";
        // If null, return "**", else return 8 asterisks to hide password
    }

    // Mask email: show first letter and last letter of username part, keep domain intact
    private String maskEmail(String email) {
        if (email == null || !email.contains("@")) return "**@**";
        // If null or invalid format, mask entire email
        String[] parts = email.split("@"); // Split email into username and domain
        String namePart = parts[0];        // Username part before '@'
        String domainPart = parts[1];      // Domain part after '@'
        String maskedName = namePart.length() <= 2 ? "**"
                : namePart.charAt(0) + "**" + namePart.charAt(namePart.length() - 1);
        // Mask username: keep first & last char if length > 2
        return maskedName + "@" + domainPart;
        // Combine masked username with domain
    }

    // Mask phone number: show only last 2 digits
    private String maskPhone(String phone) {
        if (phone == null || phone.length() <= 2) return "**";
        // If null or too short, mask completely
        return "****" + phone.substring(phone.length() - 2);
        // Mask all except last 2 digits
    }

    // Method to log user information with masking
    public void logUser(String name, String password, String email, String phone) {
        logger.info("User registered:"); // General info log
        logger.info("Name: " + maskName(name)); // Masked name log
        logger.info("Password: " + maskPassword(password)); // Masked password log
        logger.info("Email: " + maskEmail(email)); // Masked email log
        logger.info("Phone: " + maskPhone(phone)); // Masked phone log
    }
}
