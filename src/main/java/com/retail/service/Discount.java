package com.retail.service;

/**
 * The Discount interface defines a contract for calculating discounts.
 * Implementing classes should provide their own logic for applying a discount
 * to a given amount.
 */
public interface Discount {

    /**
     * Calculates the discount for a given amount.
     *
     * @param amount the original amount before discount
     * @return the discounted amount after applying the discount
     */
    double calculate(double amount);
}
