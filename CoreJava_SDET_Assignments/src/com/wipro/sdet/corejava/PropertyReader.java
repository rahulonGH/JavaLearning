package com.wipro.sdet.corejava;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Rahul
 * EMPID 847781
 */
public class PropertyReader {
	static Properties prop;
	private static InputStream input;

	static {
			prop=new Properties();
			input=null;
			input = PropertyReader.class.getClassLoader().getResourceAsStream("input.properties");
			if(input==null){
	            System.out.println("Sorry, unable to find input.properties");
			}
		try {
			prop.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			if (input != null) {
				try {
					input.close();
					//System.out.println("inside finally block of getPropertiesObj() :: InputStream closed");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
