package com.certus.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pangea")
public class NosotrosController {
	
	@GetMapping("/nosotros")
	public String nosotros() {
		return "nosotros";
	}
}

