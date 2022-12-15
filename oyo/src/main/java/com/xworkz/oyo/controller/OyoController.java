package com.xworkz.oyo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.oyo.dto.OyoDTO;
import com.xworkz.oyo.service.OyoService;
import com.xworkz.oyo.service.OyoServiceImpl;

@Controller
@RequestMapping("/save")
public class OyoController {
	@Autowired
	private OyoService service;

	public OyoController() {
		System.out.println("created OyoController");
	}

	@RequestMapping()
	public String onSave(OyoDTO dto, HttpServletRequest request) {
		System.out.println("onSave executing....");
		boolean saved = service.validateAndSave(dto);
		if (saved) {
			request.setAttribute("message", "Data Saved Successfully");
			System.out.println(dto);
		} else {
			request.setAttribute("error", "Data Not Saved.....Please Check");
		}
		return "index.jsp";
	}
}
