package com.example.demo.AuthController;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.UserDTO;

public class AuthController {
	@RestController
	@RequestMapping(value="/auth")
	public class AuthController1 {

		
		
		@GetMapping
		public String getauth() {
			return "Hello there.";
		}
		
		

		
		@PostMapping
		public String createGreeting(@Valid @RequestBody UserDTO user) {
			if (user.getpassword().equals("") {
				return String.format("the username is %s", user.getusername());
			} else if (user.getpassword().contentEquals("")){
				return  String.format("the username is %s and the password is %s", user.getusername(), user.getpassword());
			}	return String.format("You shall not pass...");
		}

			
			
			
		}
}
			
		
		
	











//Create a new controller called AuthController with prefix /auth
//Create a POST /login method
//Login endpoint should take in a LoginDTO that has a password and a username, username is all required and should not be empty.
//The endpoint should return Welcome {username}! if:
//the username is meep and the password is password123
//the username is guest
//The endpoint should return You shall not pass... in all other cases.
//Bonus:
//The ResponseEntity Class allows us to set response codes, when we aren't authorised to access a service a 401 should be returned.
//Use the ResponseEntity to return 401 code with your message.