package com.xworkz.metro.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/save")
public class MetroController {
	public MetroController() {
		System.out.println("created MetroController");
	}

	@PostMapping
	public String onSave() {
		System.out.println("excuting......onSave method");
		return "Success.jsp";
	}
}
