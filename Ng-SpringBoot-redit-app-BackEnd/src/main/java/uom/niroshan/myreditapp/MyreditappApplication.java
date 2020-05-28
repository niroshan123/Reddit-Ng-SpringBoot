package uom.niroshan.myreditapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;
import uom.niroshan.myreditapp.config.SwaggerConfiguration;

@EnableAsync
@SpringBootApplication
@Import(SwaggerConfiguration.class)

public class MyreditappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyreditappApplication.class, args);
	}

}
