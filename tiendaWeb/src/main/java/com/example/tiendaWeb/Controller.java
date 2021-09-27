package com.example.tiendaWeb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping("/")
	public String hola() {
		return "Hello word";
	}
}
