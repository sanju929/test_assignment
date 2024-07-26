package com.retail.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * Represents a user with a type and the date they became a customer.
 * <p>
 * This class holds information about the user's type and their customer start date.
 * It uses Lombok annotations to automatically generate getter and setter methods, as well as constructors.
 * </p>
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    /**
     * The type of the user, which can be used to determine the applicable discount.
     */
    private String type;

    /**
     * The date since the user has been a customer.
     * <p>
     * This date can be used to determine if the user qualifies for certain discounts based on their duration as a customer.
     * </p>
     */
    private Date customerSince;
}
