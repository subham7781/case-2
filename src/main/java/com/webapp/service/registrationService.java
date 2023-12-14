package com.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.Repository.RegistrationRepository;
import com.webapp.entity.Registration;
@Service
public class registrationService {
	@Autowired
   private RegistrationRepository repo;
	public void saveRegistration(Registration reg) {
		repo.save(reg);
	}
}
