package com.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ObjectMap {
	public static String getconfig (String object) {
		//if u throw one time u have to throw always, better use try catch
 /*String is data type. it is non premitive
  * file is a variable here
  * config.properties is value(this is path of my data)
  * FileInputStream fis = new FileInputStream(file);serilyzation
  * if some data in paranthisis() that means i am passing this data 
  * FileOutputStream fis = new FileOutputStream(file);Dserilyzation means stream to data
  */
		
		String file ="./config.properties";
	FileInputStream fis=null;
	try {
		fis = new FileInputStream(file); // this is serilyzation data to stream
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} 
	Properties properties=new Properties(); // read to note pad 
	
	try {
		properties.load(fis); // properties and serelyzation connect toghter
	} catch (IOException e) {
		
		e.printStackTrace();
	} 
	

	properties.getProperty(object) ;
	
	return properties.getProperty(object);

}

}
