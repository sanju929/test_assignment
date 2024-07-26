package com.retail.factory.discount;

import com.retail.constant.DiscountConstant;
import com.retail.service.Discount;
import org.springframework.stereotype.Component;

/**
 * CustomerDiscount class implements the Discount interface.
 * It provides a specific implementation for calculating a discount
 * by applying a fixed percentage to the given amount.
 */
@Component
public class CustomerDiscount implements Discount {

    /**
     * Calculates the discount for a given amount.
     *
     * @param amount the original amount before discount
     * @return the discounted amount after applying a 5% discount
     */
    @Override
    public double calculate(double amount) {
        return amount * DiscountConstant.CUSTOMER_DISCOUNT_PERCENTAGE;
    }
}
