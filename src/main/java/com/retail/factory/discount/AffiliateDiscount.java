package com.retail.factory.discount;

import com.retail.constant.DiscountConstant;
import com.retail.service.Discount;
import org.springframework.stereotype.Component;

/**
 * AffiliateDiscount class implements the Discount interface.
 * It calculates a discount for affiliated customers based on a
 * specific discount percentage defined in the DiscountConstant class.
 */
@Component
public class AffiliateDiscount implements Discount {

    /**
     * Calculates the discount for a given amount based on the
     * affiliate discount percentage.
     *
     * @param amount the original amount before discount
     * @return the discounted amount after applying the affiliate discount
     */
    @Override
    public double calculate(double amount) {
        return amount * DiscountConstant.AFFILIATED_DISCOUNT_PERCENTAGE;
    }
}


