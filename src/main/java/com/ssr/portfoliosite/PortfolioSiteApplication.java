package com.ssr.portfoliosite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PortfolioSiteApplication {
	public static void main(String[] args) {
		SpringApplication.run(PortfolioSiteApplication.class, args);
	}
}
