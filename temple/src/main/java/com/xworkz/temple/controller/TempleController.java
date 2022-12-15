package com.xworkz.temple.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.xworkz.temple.dto.TempleDTO;
import com.xworkz.temple.service.TempleService;

@Controller
@RequestMapping("/save")
public class TempleController {
	@Autowired
	private TempleService service;
	
	public TempleController() {
		System.out.println("created TempleController");
	}

	@PostMapping
	public String onSave(TempleDTO dto, HttpServletRequest request) {
		System.out.println("executig....onSave method");
		boolean saved = service.validateAndSave(dto);
		if (saved) {
			request.setAttribute("message", "saved sucessfully");
			System.out.println(dto);
		}else {
			request.setAttribute("error", "data not saved...please check");
		}
			return "index.jsp";
	}
}
