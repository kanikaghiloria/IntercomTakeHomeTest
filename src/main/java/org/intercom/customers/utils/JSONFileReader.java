package org.intercom.customers.utils;

import org.intercom.customers.Constants;

import java.io.*;
import java.net.URL;

public class JSONFileReader {
    public File copyFileFromUrl(URL url) throws IOException {
//        URL url = new URL("http://domain.com/file.txt");
        File customersData = new File(Constants.CUSTOMERS_DATA_JSON_FILE_PATH);
        FileOutputStream fosW = new FileOutputStream(customersData);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fosW));
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        while ((line = reader.readLine()) != null)
        {
            writer.write(line);
            writer.newLine();
        }
        writer.close();
        return customersData;
    }

}
