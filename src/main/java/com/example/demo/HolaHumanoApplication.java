package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HolaHumanoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolaHumanoApplication.class, args);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String name(@RequestParam(value="name", required = false)String name, @RequestParam(value = "surname", required = false) String surname, @RequestParam(value = "times", required = false) String times) {
		if (surname != null) {
			return "Hola " + name + " " + surname;	
			
		}
		else if (name != null){
			return "Hola " + name;
		}
		else {
			return "Hola Humano";
		}
	}

}
