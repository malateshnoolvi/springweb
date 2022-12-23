package com.xworkz.bikeshowroom.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.bikeshowroom.dto.BikeShowRoomDTO;
import com.xworkz.bikeshowroom.service.BikeShowRoomService;

@Component
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

		return "index";
	}

	@GetMapping
	public String searchByBrand(@RequestParam String brand, Model model) {
		System.out.println("executing searchByBrand method");
		Optional<List<BikeShowRoomDTO>> findByBrand = service.findByBrand(brand);
		if (findByBrand.isPresent() && findByBrand.get().size() > 0) {
			List<BikeShowRoomDTO> list = findByBrand.get();
			System.out.println(list);
			model.addAttribute("message", "Result found");
			model.addAttribute("list", list);
			return "SearchResult";
		} else {
			model.addAttribute("error", "Result not found");
			return "Search";
		}

	}

}
