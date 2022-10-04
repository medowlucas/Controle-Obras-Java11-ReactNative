package br.com.irrigaparana.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

	@GetMapping("/help")
	public String getHelloSwagger() {
	 return "O Swagger está ON";
	}
	 
}
