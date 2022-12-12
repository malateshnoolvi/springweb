package com.xworkz.bikeshowroom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bikeshowroom.dto.BikeShowRoomDTO;

@Controller
@RequestMapping("/send")
public class BusStopController {
	public BusStopController() {
		System.out.println("created BusStopController....");
	}

	@PostMapping
	public String onSend(BikeShowRoomDTO dto) {
		System.out.println("executing onSend method.....");
		return "index.jsp";
	}

}
