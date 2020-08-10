package org.intercom.customers.utils;

import org.intercom.customers.Constants;

import java.io.*;
import java.util.Map;

public class OutputFileHandler {
    File output;
    FileOutputStream fosW;
    BufferedWriter writer;

    public OutputFileHandler(String outputFilePath) {
        this.output = new File(outputFilePath);
    }

    public File getOutput() {
        return output;
    }

    public void writeToOutputFile(Map<Long, String> map) throws IOException {
        fosW = new FileOutputStream(output);
        writer = new BufferedWriter(new OutputStreamWriter(fosW));
        String line;
        for(Map.Entry<Long, String> entry : map.entrySet())
        {
            line = "{\"User ID\": " + entry.getKey() + ", \"User Name\": " + entry.getValue() + "}"+ "\n";
            writer.write(line);
        }
        writer.close();
    }
}
