package org.intercom.customers;

import org.intercom.customers.core.Location;

public class Constants {
    public static final String CUSTOMERS_FILE_URL = "https://s3.amazonaws.com/intercom-take-home-test/customers.txt";
    public static final String CUSTOMERS_DATA_JSON_FILE_PATH = "src/main/resources/customer_data_json";
    public static final String OUTPUT_FILE_PATH = "output.txt";
    public static final Location DUBLIN_OFFICE = new Location(53.339428, -6.257664);
    public static final Double MAXIMUM_DISTANCE_BETWEEN_LOCATIONS = 100.0; //in kilometers
    public static final Double EARTH_RADIUS = 6371.0; //in kilometers
}
