package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
   
	@GetMapping("/test")
	   public String testController() {
		   return "Hello";
	   }
}
