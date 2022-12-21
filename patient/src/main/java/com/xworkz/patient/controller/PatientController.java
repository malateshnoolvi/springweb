package com.xworkz.patient.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.patient.dto.PatientDTO;
import com.xworkz.patient.service.PatientService;

@Component
@RequestMapping("/save")
public class PatientController {

	@Autowired
	private PatientService service;

	public PatientController() {
		System.out.println("created PatientController...");
	}

	@PostMapping
	public String onSave(PatientDTO dto, Model model) {
		System.out.println("executing onSave method....");
		boolean findByEmail = service.findByEmail(dto.getEmail());
		boolean findByMobileNo = service.findByMobileNo(dto.getMobileNo());
		if (!findByEmail && !findByMobileNo) {
			System.out.println(dto.getEmail());
			System.out.println(dto.getMobileNo());
			model.addAttribute("error", "Email or mobile number is already exist");
			return "index";
		} else {
			boolean saved = service.validateAndSave(dto);
			if (saved) {
				model.addAttribute("message", "Patient Details Saved Successfully......");
				model.addAttribute("dto", dto);
				System.out.println(dto);
				return "SaveSuccess";
			}
		}
		return "index";
	}

	@GetMapping
	public String readByName(@RequestParam("name") String name, Model model) {
		System.out.println("executing readByName.......");
		Optional<List<PatientDTO>> findByName = service.findByName(name);
		boolean present = findByName.isPresent();
		List<PatientDTO> list = findByName.get();
		if (present) {
			model.addAttribute("message", "Result Found");
			model.addAttribute("list", list);
			return "SearchResult";
		} else {
			model.addAttribute("error", "Result Not found");
		}

		return "Search";
	}

	@GetMapping("age")
	public String readByAge(@RequestParam("age") int age, Model model) {
		System.out.println("executing readByAge.......");
		Optional<List<PatientDTO>> findByAge = service.findByAge(age);
		boolean present1 = findByAge.isPresent();
		List<PatientDTO> list1 = findByAge.get();
		if (present1) {
			model.addAttribute("message", "Result Found");
			model.addAttribute("list", list1);
			return "SearchResult";
		} else {
			model.addAttribute("error", "Result Not found");
		}

		return "Search";
	}
}
