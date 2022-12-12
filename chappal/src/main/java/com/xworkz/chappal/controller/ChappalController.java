package com.xworkz.chappal.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.chappal.dto.ChappalDTO;

@Controller
@RequestMapping("/save")
public class ChappalController {
	public ChappalController() {
		System.out.println("created ChappalController......");
	}

	@RequestMapping
	public String onSave(ChappalDTO dto, HttpServletRequest request) {
		System.out.println("executing onSend....chappal");
		if (dto.getBrand() != null && dto.getPrice() > 50) {
			request.setAttribute("message", "data saved sucessfully...Thank You");
			System.out.println(dto);
		} else {
			request.setAttribute("error", "Data Not Saved...Please check");
		}
		return "index.jsp";
	}
}
