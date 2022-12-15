package com.xworkz.busstop.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.busstop.dto.BusStopDTO;
import com.xworkz.busstop.service.BusStopService;

@Controller
@RequestMapping("/send")
public class BusStopController {
	@Autowired
	private BusStopService service;

	public BusStopController() {
		System.out.println("created BusStopController...");
	}

	@PostMapping
	public String onSend(BusStopDTO dto, HttpServletRequest request) {
		System.out.println("executing onSend........");
		boolean saved = service.validateAndSave(dto);
		if (saved) {
			request.setAttribute("message", "Data Saved Successfully...Thank You");
			System.out.println(dto);
		} else {
			request.setAttribute("error", "Data Not Saved....Please Check ");
		}
		return "index.jsp";
	}
}
