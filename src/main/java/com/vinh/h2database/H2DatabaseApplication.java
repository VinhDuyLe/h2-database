package com.vinh.h2database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2DatabaseApplication {

	public static void main(String[] args) {
		if (args.length != 0) {
			System.out.println(args[0]);
		}
		SpringApplication.run(H2DatabaseApplication.class, args);
	}

}
