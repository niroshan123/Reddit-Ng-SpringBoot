package uom.niroshan.myreditapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class MyreditappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyreditappApplication.class, args);
	}

}
