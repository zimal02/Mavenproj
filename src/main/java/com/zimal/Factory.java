package com.zimal;
public class Factory {

    //Interface
    interface Notification {
        void notifyUser(); // common method
    }

    //Email class
    static class EmailNotification implements Notification {
        public void notifyUser() {
            System.out.println("Sending Email Notification");
        }
    }

    //SMS class
    static class SMSNotification implements Notification {
        public void notifyUser() {
            System.out.println("Sending SMS Notification");
        }
    }

    // Factory Method (inside same class)
    public static Notification createNotification(String type) {

        if (type.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification(); // create email object
        }
        else if (type.equalsIgnoreCase("SMS")) {
            return new SMSNotification(); // create sms object
        }

        return null; // if type not found
    }

    //Main method
    public static void main(String[] args) {

        // get Email object from factory
        Notification n1 = createNotification("EMAIL");
        n1.notifyUser();

        // get SMS object from factory
        Notification n2 = createNotification("SMS");
        n2.notifyUser();
    }
}