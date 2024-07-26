package com.retail.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DiscountConstant {
    public static final int BULK_DISCOUNT_PERCENTAGE = 5;
    public static final double AFFILIATED_DISCOUNT_PERCENTAGE = 0.10;
    public static final double CUSTOMER_DISCOUNT_PERCENTAGE = 0.05;
    public static final double EMPLOYEE_DISCOUNT_PERCENTAGE = 0.30;

    public static final long CUSTOMER_JOINING_DATE = 2L * 365 * 24 * 60 * 60 * 1000;

    public static final String EMPLOYEE = "employee";
    public static final String AFFILIATE = "affiliate";
}
