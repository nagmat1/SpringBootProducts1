package com.nagmat.springweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductrestapiApplication {

	public static void main(String[] args) {
		for (int i=0;i<10;i++) {
			System.out.println("Hello World! "+i);
		}
		SpringApplication.run(ProductrestapiApplication.class, args);
	}

}
