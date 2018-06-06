package com.example.bookdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class BookdemoApplication {
	/*@CrossOrigin(origins = "*")

		@RequestMapping("/")
	    public Object home() {
	 		String string="Home Page";
	        return string;
	}
*/

	public static void main(String[] args) {
		SpringApplication.run(BookdemoApplication.class, args);
	}
}
