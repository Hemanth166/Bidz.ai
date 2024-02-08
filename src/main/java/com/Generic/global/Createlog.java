package com.Generic.global;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Createlog {

	
	Logger logger = Logger.getLogger(Createlog.class);

	public void info(String value) {

		
		logger.info(value);
		
	}

	public void warn(String value) {

		
		logger.warn(value);
	}

	public void error(String value) {

	
		logger.error(value);
	}

	public void fatal(String value) {

		
		logger.fatal(value);
	}

	public void debug(String value) {

	
		logger.debug(value);
	}

}
