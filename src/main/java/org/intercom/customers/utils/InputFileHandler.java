package org.intercom.customers.utils;

import org.intercom.customers.core.Customer;
import org.intercom.customers.core.Location;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;

public class InputFileHandler {
    ArrayList<Customer> customers = new ArrayList<>();
    File customersDataJSONFile;
    URL url;
    public InputFileHandler(URL url, String customerDataFilePath) {
        this.url = url;
        this.customersDataJSONFile = new File(customerDataFilePath);
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    private File copyJSONFileFromUrl() throws IOException {

        FileOutputStream fosW = new FileOutputStream(customersDataJSONFile);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fosW));
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        while ((line = reader.readLine()) != null)
        {
            writer.write(line);
            writer.newLine();
        }
        writer.close();
        return customersDataJSONFile;
    }
    public ArrayList<Customer> getAllCustomersFromFile() throws IOException, JSONException {
        File jsonFile = copyJSONFileFromUrl();
//        ArrayList<Customer> customers = new ArrayList<>();
//        JSONObject jsonObject =
        BufferedReader reader = new BufferedReader(new FileReader(jsonFile));
        String line = reader.readLine();
        while(line != null)
        {
//            JSONObject jsonObject = new JSONObject(line);
//            JSONParser parser = new JSONParser();
//            Object object = parser.parse(line);
//
//            JSONObject jsonObject = (JSONObject) object;
            JSONObject jsonObject = new JSONObject(line);

            String latitude = (String) jsonObject.get("latitude");
            int userID = (int) jsonObject.get("user_id");
            String name = (String) jsonObject.get("name");
            String longitude = (String) jsonObject.get("longitude");
            customers.add(new Customer((long) userID, name, new Location(Double.parseDouble(latitude), Double.parseDouble(longitude))));
            line = reader.readLine();
        }
        reader.close();
        return customers;
    }

    public void printAllCustomersFromFile() {
        System.out.println("Printing the details of all the customers below.");
        if(customers.size() <= 0) {
            System.out.println("No customer found in the file.");
            return;
        }
        for(Customer customer : customers)
            System.out.println(customer.toString());
    }
}
