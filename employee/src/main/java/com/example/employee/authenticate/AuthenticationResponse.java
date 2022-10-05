package com.example.employee.authenticate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthenticationResponse {
	
	private String jwt;
	
	private String role;
	
	private long id;

}
