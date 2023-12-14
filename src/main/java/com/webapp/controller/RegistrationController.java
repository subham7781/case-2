package com.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webapp.dto.RegistrationDto;
import com.webapp.entity.Registration;
import com.webapp.service.registrationService;
@Controller
public class RegistrationController {
	@Autowired
	private registrationService regservice;
	//http://localhost:8080/view-registration-page
	@RequestMapping("/view-registration-page")
	public String viewRegistration() {
		return "new_reg";
	}
	@RequestMapping("/saveReg")
	public String saveRegistration(
		
			RegistrationDto dto,
			ModelMap model
			) {
		Registration reg = new Registration();
		reg.setFirstname(dto.getFirstName());
		reg.setLastname(dto.getLastName());
		reg.setEmail(dto.getEmail());
		reg.setMobile(dto.getMobile());
		regservice.saveRegistration(reg);
		model.addAttribute("msg","record is saved!!");
		return "new_reg";
	}
}
