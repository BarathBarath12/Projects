package com.RunnerClass;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logger_Demo {
	public static Logger log = Logger.getLogger(Logger_Demo.class);

	public static void main(String[] args) {
           // BasicConfigure log
		// BasicConfigurator.configure();
		// log.debug("debug");
		// log.info("information");
		// log.warn("warn");
		// log.error("error");
		// log.fatal("fatal");
		PropertyConfigurator.configure("target\\log4j.properties");
		log.debug("debug");
		log.info("information");
		log.warn("warn");
		log.error("error");
		log.fatal("fatal");
	}
}
