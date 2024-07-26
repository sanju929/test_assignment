package com.retail.factory.discount;

import com.retail.constant.DiscountConstant;
import com.retail.service.Discount;

import org.springframework.stereotype.Component;

/**
 * EmployeeDiscount class implements the Discount interface.
 * It calculates a discount for employees based on a specific
 * discount percentage defined in the DiscountConstant class.
 */
@Component
public class EmployeeDiscount implements Discount {

    /**
     * Calculates the discount for a given amount based on the
     * employee discount percentage.
     *
     * @param amount the original amount before discount
     * @return the discounted amount after applying the employee discount
     */
    @Override
    public double calculate(double amount) {
        return amount * DiscountConstant.EMPLOYEE_DISCOUNT_PERCENTAGE;
    }
}


