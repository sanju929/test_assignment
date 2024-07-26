package com.retail.service_impl;

import com.retail.constant.DiscountConstant;
import com.retail.factory.DiscountFactory;
import com.retail.model.Bill;
import com.retail.model.User;
import com.retail.service.Discount;
import com.retail.service.DiscountService;
import org.springframework.stereotype.Service;


/**
 * DiscountServiceImpl is an implementation of the DiscountService interface.
 * It provides functionality to calculate the net payable amount for a given bill
 * and user based on the applicable discount.
 */
@Service
public class DiscountServiceImpl implements DiscountService {

    private final DiscountFactory discountFactory;

    /**
     * Constructs a DiscountServiceImpl with the specified DiscountFactory.
     *
     * @param discountFactory the DiscountFactory used to obtain the appropriate Discount instance
     */
    public DiscountServiceImpl(DiscountFactory discountFactory) {
        this.discountFactory = discountFactory;
    }

    /**
     * Calculates the net payable amount after applying the discount for the given bill and user.
     *
     * The method retrieves the appropriate Discount instance from the DiscountFactory based on the user,
     * calculates the discount amount, and then applies a bulk discount if applicable. The final net payable
     * amount is computed by subtracting the higher of the calculated discount or the bulk discount from the bill amount.
     *
     * @param bill the Bill object containing the amount before discount
     * @param user the User object used to determine the applicable discount
     * @return the net payable amount after applying the discount
     */
    @Override
    public double calculateNetPayable(Bill bill, User user) {
        Discount discount = discountFactory.getDiscount(user);
        double discountAmount = discount.calculate(bill.getAmount());
        double bulkDiscountAmount = (bill.getAmount() / 100) * DiscountConstant.BULK_DISCOUNT_PERCENTAGE;
        return bill.getAmount() - Math.max(discountAmount, bulkDiscountAmount);
    }
}

