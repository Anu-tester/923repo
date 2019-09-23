package com.qa.ecommerce;

import org.apache.log4j.Logger;

public class Log4jsample {
public final static Logger logger = Logger.getLogger(Log4jsample.class);
	public static void main(String[] args) {
		
		logger.debug("this is debug message");
		logger.info("this is info message");
		logger.warn(" this is warn message");
		logger.error("this is error message");
		logger.fatal("this is fatal message");
	}
}
