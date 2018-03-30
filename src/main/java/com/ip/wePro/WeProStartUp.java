package com.ip.wePro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.ip.wePro.configuration.JpaConfiguration;


@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.ip.wePro"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class WeProStartUp {

	public static void main(String[] args) {
		SpringApplication.run(WeProStartUp.class, args);
	}
}
