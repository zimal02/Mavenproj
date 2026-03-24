package com.zimal;//class belongs to folder com.zimal
import org.apache.logging.log4j.LogManager;//used to create a Logger object
import org.apache.logging.log4j.Logger;//Logger → used to print log messages


public class OrderPlace{
    //private → only accessible inside this class,static → shared across the class (one instance),final → cannot be changed,Logger → object used for logging
    private static final Logger logger= LogManager.getLogger(OrderPlace.class);
//LogManager.getLogger(OrderService.class)->Creates a logger for this class,Logs will show this class name

    public void orderservices(String name,int productid)//This method handles placing an order
    {
        logger.info(name + " place your order");//Used for normal application flow,Shows that order process has started
        logger.debug(name + " Check product availability"+ productid);//Used for internal system tracking
        boolean instock=true;//product is available in stock or not

        if(!instock)//Checks if product is NOT available
        {
            logger.warn("...out of stock..." + productid);//System is still running, but something is wrong
            return;//Stops the method execution if product is not available.
        }
        logger.info("Add to Card");//Indicates product was successfully added to cart.
        try//Used to handle exceptions safely
        {
            logger.info("Processing payment");//Shows that payment process has started
            boolean paymentSuccess=true;//payment success or failure
            if(paymentSuccess)//Checks if payment was successful
                {
                logger.info("Your order is place");//Payment completed successfully
            }
            else {
                logger.info("Payment failed");//Indicates payment failure
            }
        } catch (Exception e)//Handles unexpected runtime errors
        {
            logger.error("Unexpected error occure" +e);//Logs the error message along with full exception details.
        }
    }
}