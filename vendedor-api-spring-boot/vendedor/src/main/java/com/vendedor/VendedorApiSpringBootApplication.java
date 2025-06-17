package com.vendedor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.vendedor")
public class VendedorApiSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(VendedorApiSpringBootApplication.class, args);
	}

}
