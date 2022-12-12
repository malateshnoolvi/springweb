package com.xworkz.oyo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.oyo.dto.OyoDTO;

@Controller
@RequestMapping("/save")
public class OyoController {
	public OyoController() {
		System.out.println("created OyoController");
	}

	@RequestMapping
	public String onSave(OyoDTO dto, HttpServletRequest request) {
		System.out.println("onSave executing....");

		if (dto.getArea() > 0 && dto.getRoomRent() > 0) {
			System.out.println(dto);
			request.setAttribute("message", "Data Saved Successfully");
		} else {
			request.setAttribute("error", "Data Not Saved.....Please Check");
		}
		return "index.jsp";
	}
}
