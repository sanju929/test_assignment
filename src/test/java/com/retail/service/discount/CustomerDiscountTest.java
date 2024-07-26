package com.retail.service.discount;

import com.retail.factory.discount.CustomerDiscount;
import com.retail.constant.DiscountConstant;

/**
 * CustomerDiscount class implements the Discount interface.
 * It provides a specific implementation for calculating a discount
 * by applying a fixed percentage to the given amount.
 */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for the CustomerDiscount class.
 */
class CustomerDiscountTest {

    private CustomerDiscount customerDiscount;

    /**
     * Initializes the CustomerDiscount instance before each test.
     */
    @BeforeEach
    void setUp() {
        customerDiscount = new CustomerDiscount();
    }

    /**
     * Tests the calculation of discount with a positive amount.
     * Verifies that the discount is correctly applied to the amount.
     */
    @Test
    void calculate_withPositiveAmount() {
        double amount = 1000.0;
        double expectedDiscount = amount * DiscountConstant.CUSTOMER_DISCOUNT_PERCENTAGE;
        double actualDiscount = customerDiscount.calculate(amount);
        assertEquals(expectedDiscount, actualDiscount, "Discount calculation is incorrect for positive amount.");
    }

    /**
     * Tests the calculation of discount with a zero amount.
     * Verifies that the discount calculation returns zero when the amount is zero.
     */
    @Test
    void calculate_withZeroAmount() {
        double amount = 0.0;
        double expectedDiscount = amount * DiscountConstant.CUSTOMER_DISCOUNT_PERCENTAGE;
        double actualDiscount = customerDiscount.calculate(amount);
        assertEquals(expectedDiscount, actualDiscount, "Discount calculation is incorrect for zero amount.");
    }

    /**
     * Tests the calculation of discount with a negative amount.
     * Verifies that the discount calculation correctly handles negative amounts.
     */
    @Test
    void calculate_withNegativeAmount() {
        double amount = -500.0;
        double expectedDiscount = amount * DiscountConstant.CUSTOMER_DISCOUNT_PERCENTAGE;
        double actualDiscount = customerDiscount.calculate(amount);
        assertEquals(expectedDiscount, actualDiscount, "Discount calculation is incorrect for negative amount.");
    }
}

