package org.intercom.customers.nearestcustomers;

import org.intercom.customers.core.Customer;
import org.intercom.customers.core.Location;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class NearestCustomersTest {
    @Test
    void getAllNearestCustomers() {
        Location officeLocation = new Location(53.339428, -6.257664);
        Double maximumDistance = 100.0;
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1L, "abc", new Location(52.986375, -6.043701)));
        customers.add(new Customer(2L, "def", new Location(51.92893, -10.27699)));
        customers.add(new Customer(3L, "ghi", new Location(51.8856167, -10.4240951)));
        customers.add(new Customer(4L, "jkl", new Location(54.0894797, -6.18671)));

        NearestCustomers object = new NearestCustomers();
        TreeMap<Long, String> nearestCustomers = object.getAllNearestCustomers(customers, officeLocation, maximumDistance);
        assertTrue(nearestCustomers.containsKey(1L));
        assertTrue(nearestCustomers.containsKey(4L));
        assertFalse(nearestCustomers.containsKey(2L));
        assertEquals(2, nearestCustomers.size());
    }
}