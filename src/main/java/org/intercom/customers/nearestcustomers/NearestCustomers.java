package org.intercom.customers.nearestcustomers;

import org.intercom.customers.Constants;
import org.intercom.customers.core.Customer;
import org.intercom.customers.core.Location;
import org.intercom.customers.utils.Distance;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class NearestCustomers {
    TreeMap<Long, String> nearestCustomers;
//    int size;

    public NearestCustomers() {
//        this.nearestCustomers = nearestCustomers;
        nearestCustomers = new TreeMap<>();
    }

    public int getSize() {
        return nearestCustomers.size();
    }

    public TreeMap<Long, String> getAllNearestCustomers(ArrayList<Customer> customers,
                                        Location officeLocation, Double maximumDistance)
    {

        for (Customer customer:customers)
        {
            Distance distance = new Distance(customer.getLocation(), officeLocation);
            if(distance.distanceBetweenLocations() < maximumDistance)
                nearestCustomers.put(customer.getUserID(), customer.getName());
        }
        return nearestCustomers;
    }
    public void printAllNearestCustomers()
    {
        System.out.println("Printing all nearest customers within the selected range.");
        if(nearestCustomers.size() <= 0)
            System.out.println("No customer lies within the range of " + Constants.MAXIMUM_DISTANCE_BETWEEN_LOCATIONS + " km");
        else
        {
            for(Map.Entry<Long, String> entry : nearestCustomers.entrySet())
                System.out.println("{\"User ID\": " + entry.getKey() + ", \"User Name\": " + entry.getValue() + "}");
        }
    }
}
