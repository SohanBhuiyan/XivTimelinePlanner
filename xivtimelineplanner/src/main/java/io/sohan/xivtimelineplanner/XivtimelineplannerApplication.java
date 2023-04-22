package io.sohan.xivtimelineplanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.sohan.xivtimelineplanner.models.Job;

@SpringBootApplication
public class XivtimelineplannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(XivtimelineplannerApplication.class, args);
		Job j = new Job(); 
	}

}
