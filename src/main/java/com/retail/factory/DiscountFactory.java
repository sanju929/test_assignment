package com.retail.factory;


import com.retail.factory.discount.AffiliateDiscount;
import com.retail.factory.discount.BulkDiscount;
import com.retail.factory.discount.CustomerDiscount;
import com.retail.factory.discount.EmployeeDiscount;
import com.retail.constant.DiscountConstant;
import com.retail.model.User;
import com.retail.service.Discount;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * DiscountFactory class is responsible for providing the appropriate Discount instance
 * based on the type and attributes of the User.
 */
@Component
public class DiscountFactory {

    private final EmployeeDiscount employeeDiscount;
    private final AffiliateDiscount affiliateDiscount;
    private final CustomerDiscount customerDiscount;
    private final BulkDiscount bulkDiscount;

    /**
     * Constructs a DiscountFactory with the specified Discount instances.
     *
     * @param employeeDiscount an instance of EmployeeDiscount
     * @param affiliateDiscount an instance of AffiliateDiscount
     * @param customerDiscount an instance of CustomerDiscount
     * @param bulkDiscount an instance of BulkDiscount
     */
    public DiscountFactory(
            EmployeeDiscount employeeDiscount,
            AffiliateDiscount affiliateDiscount,
            CustomerDiscount customerDiscount,
            BulkDiscount bulkDiscount
    ) {
        this.employeeDiscount = employeeDiscount;
        this.affiliateDiscount = affiliateDiscount;
        this.customerDiscount = customerDiscount;
        this.bulkDiscount = bulkDiscount;
    }

    /**
     * Determines and returns the appropriate Discount instance based on the type
     * and attributes of the given User.
     *
     * @param user the User for whom the Discount is to be determined
     * @return the appropriate Discount instance
     */
    public Discount getDiscount(User user) {
        if (DiscountConstant.EMPLOYEE.equals(user.getType())) {
            return employeeDiscount;
        } else if (DiscountConstant.AFFILIATE.equals(user.getType())) {
            return affiliateDiscount;
        } else {
            if (user.getCustomerSince().before(new Date(System.currentTimeMillis() - DiscountConstant.CUSTOMER_JOINING_DATE))) {
                return customerDiscount;
            } else {
                return bulkDiscount; // Default
            }
        }
    }
}


