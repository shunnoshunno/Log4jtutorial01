package mfh.log4j.test;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogTest01 {

	static Logger logger=Logger.getLogger("LogTest01.class");
	public static void main(String[] args) {
		
		//BasicConfigurator.configure();
		
		PropertyConfigurator.configure("src/main/resources/log4j.properties");
		
		
		logger.debug("This is debugging message......");
		logger.error("This is error message......");

	}

}
