package com.example.demo.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UserDTO {
	@NotBlank
	String name;
	String username;
	
	@NotNull
	Integer age;
	
	public Integer getAge() { return this.age; }
	public void setAge(Integer age) { this.age = age; }
	public String getName() { return this.name; }
	public void setName(String name) {this.name = name; }
	public String getusername() { return this.username; }
	public void setusername(String username) {this.username = username; }
	public String getpassword() { return this.getpassword(); }
	public void setpassword(String password) {this.password = password; }

}
