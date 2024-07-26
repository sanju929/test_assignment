package com.retail.service.discount;

import com.retail.factory.discount.BulkDiscount;
import com.retail.constant.DiscountConstant;

/**
 * BulkDiscount class implements the Discount interface.
 * It calculates a discount based on a percentage of the given amount.
 */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for the BulkDiscount class.
 */
class BulkDiscountTest {

    private BulkDiscount bulkDiscount;

    /**
     * Initializes the BulkDiscount instance before each test.
     */
    @BeforeEach
    void setUp() {
        bulkDiscount = new BulkDiscount();
    }

    /**
     * Tests the calculation of discount with a positive amount.
     */
    @Test
    void calculate_withPositiveAmount() {
        double amount = 1000.0;
        double expectedDiscount = (amount / 100) * DiscountConstant.BULK_DISCOUNT_PERCENTAGE;
        double actualDiscount = bulkDiscount.calculate(amount);
        assertEquals(expectedDiscount, actualDiscount, "Discount calculation is incorrect for positive amount.");
    }

    /**
     * Tests the calculation of discount with a zero amount.
     */
    @Test
    void calculate_withZeroAmount() {
        double amount = 0.0;
        double expectedDiscount = (amount / 100) * DiscountConstant.BULK_DISCOUNT_PERCENTAGE;
        double actualDiscount = bulkDiscount.calculate(amount);
        assertEquals(expectedDiscount, actualDiscount, "Discount calculation is incorrect for zero amount.");
    }

    /**
     * Tests the calculation of discount with a negative amount.
     */
    @Test
    void calculate_withNegativeAmount() {
        double amount = -500.0;
        double expectedDiscount = (amount / 100) * DiscountConstant.BULK_DISCOUNT_PERCENTAGE;
        double actualDiscount = bulkDiscount.calculate(amount);
        assertEquals(expectedDiscount, actualDiscount, "Discount calculation is incorrect for negative amount.");
    }
}



