package com.retail.service.discount;

import com.retail.factory.discount.AffiliateDiscount;
import com.retail.constant.DiscountConstant;


/**
 * AffiliateDiscount class implements the Discount interface.
 * It calculates a discount for affiliated customers based on a
 * specific discount percentage defined in the DiscountConstant class.
 */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for the AffiliateDiscount class.
 */
class AffiliateDiscountTest {

    private AffiliateDiscount affiliateDiscount;

    /**
     * Initializes the AffiliateDiscount instance before each test.
     */
    @BeforeEach
    void setUp() {
        affiliateDiscount = new AffiliateDiscount();
    }

    /**
     * Tests the calculation of discount with a positive amount.
     */
    @Test
    void calculate_withPositiveAmount() {
        double amount = 1000.0;
        double expectedDiscount = amount * DiscountConstant.AFFILIATED_DISCOUNT_PERCENTAGE;
        double actualDiscount = affiliateDiscount.calculate(amount);
        assertEquals(expectedDiscount, actualDiscount, "Discount calculation is incorrect.");
    }

    /**
     * Tests the calculation of discount with a zero amount.
     */
    @Test
    void calculate_withZeroAmount() {
        double amount = 0.0;
        double expectedDiscount = amount * DiscountConstant.AFFILIATED_DISCOUNT_PERCENTAGE;
        double actualDiscount = affiliateDiscount.calculate(amount);
        assertEquals(expectedDiscount, actualDiscount, "Discount calculation is incorrect for zero amount.");
    }

    /**
     * Tests the calculation of discount with a negative amount.
     */
    @Test
    void calculate_withNegativeAmount() {
        double amount = -500.0;
        double expectedDiscount = amount * DiscountConstant.AFFILIATED_DISCOUNT_PERCENTAGE;
        double actualDiscount = affiliateDiscount.calculate(amount);
        assertEquals(expectedDiscount, actualDiscount, "Discount calculation is incorrect for negative amount.");
    }
}



