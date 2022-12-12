package com.xworkz.bikeshowroom.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bikeshowroom.dto.BikeShowRoomDTO;

@Controller
@RequestMapping("/send")
public class BikeShowRoomController {
	public BikeShowRoomController() {
		System.out.println("created BikeShowRoomController...");
	}
@PostMapping
	public String onSend(BikeShowRoomDTO dto, HttpServletRequest request) {
		System.out.println("executing onSend of bike......");
		if (dto.getAmbassador() != null && dto.getBrand() != null && dto.getDescription() != null
				&& dto.getLocation() != null && dto.getOwnerName() != null) {
			request.setAttribute("message", "Data Saved Successfully");
			System.out.println(dto);
		} else {
			request.setAttribute("error", "Data Not Saved...Please Check");
		}

		return "index.jsp";
	}
}
