package org.intercom.customers;

import org.intercom.customers.core.LocationPOJO;

public class Constants {
    public static final String CUSTOMERS_FILE_URL = "https://s3.amazonaws.com/intercom-take-home-test/customers.txt";
    public static final LocationPOJO DUBLIN_OFFICE = new LocationPOJO(53.339428, -6.257664);
    public static final String CUSTOMERS_DATA_JSON_FILE_PATH = "src/main/resources/customer_data_json";
}
