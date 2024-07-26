package com.retail.service.discount;

import com.retail.factory.discount.EmployeeDiscount;
import com.retail.constant.DiscountConstant;

/**
 * EmployeeDiscount class implements the Discount interface.
 * It calculates a discount for employees based on a specific
 * discount percentage defined in the DiscountConstant class.
 */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for the EmployeeDiscount class.
 */
class EmployeeDiscountTest {

    private EmployeeDiscount employeeDiscount;

    /**
     * Initializes the EmployeeDiscount instance before each test.
     */
    @BeforeEach
    void setUp() {
        employeeDiscount = new EmployeeDiscount();
    }

    /**
     * Tests the calculation of discount with a positive amount.
     * Verifies that the discount is correctly applied to the amount.
     */
    @Test
    void calculate_withPositiveAmount() {
        double amount = 1000.0;
        double expectedDiscount = amount * DiscountConstant.EMPLOYEE_DISCOUNT_PERCENTAGE;
        double actualDiscount = employeeDiscount.calculate(amount);
        assertEquals(expectedDiscount, actualDiscount, "Discount calculation is incorrect for positive amount.");
    }

    /**
     * Tests the calculation of discount with a zero amount.
     * Verifies that the discount calculation returns zero when the amount is zero.
     */
    @Test
    void calculate_withZeroAmount() {
        double amount = 0.0;
        double expectedDiscount = amount * DiscountConstant.EMPLOYEE_DISCOUNT_PERCENTAGE;
        double actualDiscount = employeeDiscount.calculate(amount);
        assertEquals(expectedDiscount, actualDiscount, "Discount calculation is incorrect for zero amount.");
    }

    /**
     * Tests the calculation of discount with a negative amount.
     * Verifies that the discount calculation correctly handles negative amounts.
     */
    @Test
    void calculate_withNegativeAmount() {
        double amount = -500.0;
        double expectedDiscount = amount * DiscountConstant.EMPLOYEE_DISCOUNT_PERCENTAGE;
        double actualDiscount = employeeDiscount.calculate(amount);
        assertEquals(expectedDiscount, actualDiscount, "Discount calculation is incorrect for negative amount.");
    }
}



