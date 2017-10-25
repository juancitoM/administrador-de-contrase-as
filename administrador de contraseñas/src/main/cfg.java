package main;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class cfg {

    public static String host_base;

    public cfg() {
        //InputStreamReader fileStream = new InputStreamReader(cfg.class.getResourceAsStream("Config.ini"));        
        
        try {
            FileReader file = new FileReader("Config.ini");
            Properties props = new Properties();
            //props.load(fileStream);
            props.load(file);
            host_base = props.getProperty("HOSTNAME");
            //fileStream.close();
            file.close();

        } catch (FileNotFoundException ex) {
            // file does not exist
        } catch (IOException ex) {
            // I/O error
        }

    }

}
