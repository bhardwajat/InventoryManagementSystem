package com.revature.ims;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.log4j.Logger;

@SpringBootApplication
public class ImsApplication {

	static Logger log = Logger.getLogger(ImsApplication.class.getName());

	public static void main(String[] args) {

//		log.debug("Debug log");
//		log.trace("Trace log");
//		log.info("Info log");

		log.fatal("Fatal Log");

		SpringApplication.run(ImsApplication.class, args);


	}
}
