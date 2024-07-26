package com.retail.service;

import com.retail.factory.DiscountFactory;
import com.retail.model.Bill;
import com.retail.model.User;
import com.retail.service_impl.DiscountServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Unit tests for the DiscountServiceImpl class, which handles the calculation of net payable amounts
 * based on various discount types.
 */
class DiscountServiceTest {

    @Mock
    private DiscountFactory discountFactory;

    @Mock
    private Discount discount;

    @InjectMocks
    private DiscountServiceImpl discountService;

    /**
     * Initializes mocks before each test.
     */
    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    /**
     * Tests the calculation of net payable amount when the discount is an employee discount.
     */
    @Test
    void calculateNetPayable_withEmployeeDiscount() {
        User user = new User("employee", new Date());
        Bill bill = new Bill(1000);

        when(discountFactory.getDiscount(user)).thenReturn(discount);
        when(discount.calculate(1000)).thenReturn(300.0);

        double netPayable = discountService.calculateNetPayable(bill, user);
        assertEquals(700.0, netPayable);

        verify(discountFactory, times(1)).getDiscount(user);
        verify(discount, times(1)).calculate(1000);
    }

    /**
     * Tests the calculation of net payable amount when the discount is an affiliate discount.
     */
    @Test
    void calculateNetPayable_withAffiliateDiscount() {
        User user = new User("affiliate", new Date());
        Bill bill = new Bill(1000);

        when(discountFactory.getDiscount(user)).thenReturn(discount);
        when(discount.calculate(1000)).thenReturn(100.0);

        double netPayable = discountService.calculateNetPayable(bill, user);
        assertEquals(900.0, netPayable);

        verify(discountFactory, times(1)).getDiscount(user);
        verify(discount, times(1)).calculate(1000);
    }

    /**
     * Tests the calculation of net payable amount when the discount is a customer discount.
     */
    @Test
    void calculateNetPayable_withCustomerDiscount() {
        User user = new User("customer", new Date(System.currentTimeMillis() - 3L * 365 * 24 * 60 * 60 * 1000));
        Bill bill = new Bill(1000);

        when(discountFactory.getDiscount(user)).thenReturn(discount);
        when(discount.calculate(1000)).thenReturn(50.0);

        double netPayable = discountService.calculateNetPayable(bill, user);
        assertEquals(950.0, netPayable);

        verify(discountFactory, times(1)).getDiscount(user);
        verify(discount, times(1)).calculate(1000);
    }

    /**
     * Tests the calculation of net payable amount when the discount is a bulk discount.
     */
    @Test
    void calculateNetPayable_withBulkDiscount() {
        User user = new User("new_customer", new Date());
        Bill bill = new Bill(990);

        when(discountFactory.getDiscount(user)).thenReturn(discount);
        when(discount.calculate(990)).thenReturn(0.0);

        double netPayable = discountService.calculateNetPayable(bill, user);
        assertEquals(940.5, netPayable);

        verify(discountFactory, times(1)).getDiscount(user);
        verify(discount, times(1)).calculate(990);
    }

    /**
     * Tests the calculation of net payable amount when the bulk discount is greater than other discounts.
     */
    @Test
    void calculateNetPayable_bulkDiscountGreaterThanOtherDiscount() {
        User user = new User("employee", new Date());
        Bill bill = new Bill(300);

        when(discountFactory.getDiscount(user)).thenReturn(discount);
        when(discount.calculate(300)).thenReturn(90.0); // 30% of 300

        double netPayable = discountService.calculateNetPayable(bill, user);
        assertEquals(210.0, netPayable); // $15 discount for every $100 in bill (3*$5)

        verify(discountFactory, times(1)).getDiscount(user);
        verify(discount, times(1)).calculate(300);
    }
}



