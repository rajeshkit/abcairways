package com.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AirwaysController {
	@GetMapping("/")
	public String welcome() {
		return "welcome";
	}
}
