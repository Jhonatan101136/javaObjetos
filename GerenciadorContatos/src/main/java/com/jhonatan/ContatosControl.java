package com.jhonatan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ContatosControl {

	@GetMapping("/")
	public String index() {
		return "index";
	}
}
