package com.xworkz.patient.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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
	public String onSave(PatientDTO dto, Model model, @RequestParam MultipartFile file) {
		System.out.println("executing onSave method....");
		boolean findByEmail = service.findByEmail(dto.getEmail());
		boolean findByMobileNo = service.findByMobileNo(dto.getMobileNo());
		System.out.println(findByEmail + "mail");
		System.out.println(findByMobileNo + "phone");

		if (findByEmail && findByMobileNo) {
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
				if (file != null) {
					byte[] bytes;
					String files = System.currentTimeMillis() + "_" + file.getOriginalFilename();
					System.out.println("File original name" + file.getOriginalFilename());
					System.out.println("File size" + file.getSize());
					System.out.println("File type" + file.getContentType());
					try {
						bytes = file.getBytes();
						Path path = Paths.get("D:\\app-images\\" + file.getOriginalFilename());
						System.out.println(path);
						Files.write(path, bytes);
						dto.setFileName(files);
						long size = file.getSize();
						dto.setFileSize(size);
						String name = file.getName();
						dto.setFileName(name);
						String contentType = dto.getContentType();
						dto.setContentType(contentType);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				return "SaveSuccess";
			}
		}
		return "index";
	}

	@GetMapping
	public String readByName(@RequestParam("name") String name, int greaterThanAge, int lesserThanAge, Model model) {
		System.out.println("executing readByName.......");
		Optional<List<PatientDTO>> findByName = service.findByName(name, greaterThanAge, lesserThanAge);
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

	@GetMapping(value = "files/{file_name}")
	public void getFile(@PathVariable("file_name") String filename, HttpServletResponse response) throws IOException {
		System.out.println("file name is" + filename);
		Path path = Paths.get("D:\\app-images\\" + filename);
		byte[] file = Files.readAllBytes(path);
		response.reset();

		response.setContentType("image/jpg");
		try {
			response.getOutputStream().write(file);
			String contentType = response.getContentType();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
