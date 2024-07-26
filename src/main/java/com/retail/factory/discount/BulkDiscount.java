package com.retail.factory.discount;

import com.retail.constant.DiscountConstant;
import com.retail.service.Discount;
import org.springframework.stereotype.Component;

/**
 * BulkDiscount class implements the Discount interface.
 * It calculates a discount based on a percentage of the given amount.
 */
@Component
public class BulkDiscount implements Discount {

    /**
     * Calculates the discount for a given amount.
     * The discount is computed as 5% of the amount.
     *
     * @param amount the original amount before discount
     * @return the discounted amount after applying a 5% discount
     */
    @Override
    public double calculate(double amount) {
        return (amount / 100) * DiscountConstant.BULK_DISCOUNT_PERCENTAGE;
    }
}


