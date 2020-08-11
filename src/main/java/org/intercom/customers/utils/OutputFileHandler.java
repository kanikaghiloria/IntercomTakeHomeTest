package org.intercom.customers.utils;

import org.intercom.customers.Constants;

import java.io.*;
import java.util.Map;

public class OutputFileHandler {
    private File outputFile;
    private FileOutputStream fosW;
    private BufferedWriter writer;

    public OutputFileHandler(String outputFilePath) {
        this.outputFile = new File(outputFilePath);
    }

    public File getOutput() {
        return outputFile;
    }

    public void writeToOutputFile(Map<Long, String> map) throws IOException {
        fosW = new FileOutputStream(outputFile);
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
