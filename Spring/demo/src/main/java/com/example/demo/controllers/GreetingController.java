package com.example.demo.controllers;

import javax.validation.Valid;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.UserDTO;
import com.fasterxml.jackson.core.sym.Name;

@RestController
@RequestMapping(value="/greetings")
public class GreetingController {

	// GET/greeting -> Hello there.
	
	@GetMapping
	public String getGreeting() {
		return "Hello there.";
	}
	
	@GetMapping(value="/{name}")
	public String getCustomerGreeting(@PathVariable String name) {
		return String.format("Hello %s. ", name);
	}
	@GetMapping(value ="/{name}{age}")
	public String getwithParams(@PathVariable String name, @PathVariable Integer age, @RequestParam Integer withAge, Object user) {
		if (withAge == (Integer) 0) {
			return String.format("Hello %s", name);
		} 
		return String.format("Hello %s, you are %d years old", user, age);
	}
		
	
	@PostMapping
	public String createGreeting(@Valid @RequestBody UserDTO user) {
		return String.format("Hello %s, you are %d years old", user.getName(), user.getAge());
	}
	
	@DeleteMapping(value ="/{name}")
	public String deleteUser(@PathVariable String name) {
		return String.format("User with name => %s, was delete", name);
	}
}
