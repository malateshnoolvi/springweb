package com.xworkz.bikeshowroom.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bikeshowroom.dto.BikeShowRoomDTO;
import com.xworkz.bikeshowroom.service.BikeShowRoomService;

@Controller
@RequestMapping("/send")
public class BikeShowRoomController {

	@Autowired
	private BikeShowRoomService service;

	public BikeShowRoomController() {
		System.out.println("created BikeShowRoomController...");
	}

	@PostMapping
	public String onSend(BikeShowRoomDTO dto, HttpServletRequest request) {
		System.out.println("executing onSend of bike......");
		boolean saved = service.validateAndSave(dto);
		if (saved) {
			request.setAttribute("message", "Data Saved Successfully");
			System.out.println(dto);
		} else {
			request.setAttribute("error", "Data Not Saved...Please Check");
		}

		return "index.jsp";
	}
}
