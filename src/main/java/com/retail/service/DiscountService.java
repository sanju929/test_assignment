package com.retail.service;

import com.retail.model.Bill;
import com.retail.model.User;

/**
 * The DiscountService interface defines a contract for services that
 * calculate the net payable amount after applying discounts.
 *
 * Implementing classes should provide their own logic for computing
 * the final amount a user needs to pay based on the bill and applicable discounts.
 */
public interface DiscountService {

    /**
     * Calculates the net payable amount after applying the discount for the given bill and user.
     *
     * This method determines the appropriate discount based on the user, applies it to the bill amount,
     * and computes the final amount to be paid. The exact discount calculation is implemented by the
     * class implementing this interface.
     *
     * @param bill the Bill object containing the amount before discount
     * @param user the User object used to determine the applicable discount
     * @return the net payable amount after applying the discount
     */
    double calculateNetPayable(Bill bill, User user);
}

