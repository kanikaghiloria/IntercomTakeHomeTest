package org.intercom.customers;

import org.intercom.customers.nearestcustomers.NearestCustomers;
import org.intercom.customers.utils.InputFileHandler;
import org.intercom.customers.utils.OutputFileHandler;
import org.json.JSONException;

import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.TreeMap;

public class NearestCustomersApplication {
    public static void main(String[] args) throws IOException, JSONException {
        URL url = new URL(Constants.CUSTOMERS_FILE_URL);
        InputFileHandler reader = new InputFileHandler(url, Constants.CUSTOMERS_DATA_JSON_FILE_PATH);
        OutputFileHandler writer = new OutputFileHandler(Constants.OUTPUT_FILE_PATH);
        reader.getAllCustomersFromFile();
//        reader.printAllCustomersFromFile();
        NearestCustomers nearestCustomersObject = new NearestCustomers();
        TreeMap<Long, String> nearestCustomers = nearestCustomersObject.getAllNearestCustomers(reader.getCustomers(),
                Constants.DUBLIN_OFFICE, Constants.MAXIMUM_DISTANCE_BETWEEN_LOCATIONS);
        System.out.println("Total customers found within the range of " + Constants.MAXIMUM_DISTANCE_BETWEEN_LOCATIONS + ": "
                + nearestCustomersObject.getSize());
        nearestCustomersObject.printAllNearestCustomers();
        writer.writeToOutputFile(nearestCustomers);
    }

}
