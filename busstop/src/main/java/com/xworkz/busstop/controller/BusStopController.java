package com.xworkz.busstop.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.busstop.dto.BusStopDTO;

@Controller
@RequestMapping("/send")
public class BusStopController { 
	public BusStopController() {
System.out.println("created BusStopController...");	
	}

	@PostMapping
	public String onSend(BusStopDTO dto,HttpServletRequest request) {
		System.out.println("executing onSend........");
		if(dto.getCapacity()>0&&dto.getLocation()!=null&&dto.getNoOfFlatForms()>0&&dto.getNoOfWorkers()>0) {
			request.setAttribute("message", "Data Saved Successfully...Thank You");
		System.out.println(dto);
		}else {
			request.setAttribute("error", "Data Not Saved....Please Check ");
		}
		return "index.jsp";
	}
}
