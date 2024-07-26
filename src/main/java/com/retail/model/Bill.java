package com.retail.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Represents a bill with a specified amount.
 * <p>
 * This class holds the amount for a bill and provides methods for accessing and modifying it.
 * It uses Lombok annotations to generate boilerplate code such as getters, setters, and constructors.
 * </p>
 */
@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Bill {

    /**
     * The amount of the bill before any discounts are applied.
     */
    private double amount;
}

