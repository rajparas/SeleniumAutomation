package com;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Demo {

	static Logger log = (Logger) LogManager.getLogger(Demo.class);
	
	public static void main(String[] args) 
	{
		// System.out.println("Program Started ...");
		
		log.info("Info message");
		log.debug("Debug message");
		log.error("Error message");
		log.fatal("Fatal message");

	}

}
