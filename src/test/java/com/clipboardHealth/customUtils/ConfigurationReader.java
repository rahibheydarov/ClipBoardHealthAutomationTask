package com.clipboardHealth.customUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {



        private static Properties properties = new Properties();

        static{

            try {
                FileInputStream file = new FileInputStream("src/configuration.properties");
                        properties.load(file);
                file.close();

            } catch (IOException e) {


                System.out.println("File not found in configuration");
            }

            finally {
                System.out.println("Finally Block. Properties File Has been Initiated and Initialization Finished.");
            }


        }
    public static String getProperty(String keyword){

        return properties.getProperty(keyword);

    }


}
