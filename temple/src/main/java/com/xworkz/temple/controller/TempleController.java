package com.xworkz.temple.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.xworkz.temple.dto.TempleDTO;

@Controller
@RequestMapping("/save")
public class TempleController {
	public TempleController() {
		System.out.println("created TempleController");
	}

	@PostMapping
	public String onSave(TempleDTO dto, HttpServletRequest request) {
		System.out.println("executig....onSave method");
		if (dto.getFees() > 0 && dto.getClosingTime() > 0 && dto.getOpeningTime() > 0 && dto.getName() != null) {
			request.setAttribute("message", "saved sucessfully");
			System.out.println(dto);
		}else {
			request.setAttribute("error", "data not saved...please check");
		}
			return "index.jsp";
	}
}
