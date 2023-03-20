package com.webapp.surveys.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.surveys.demo.DAO.SurveyRepo;
import com.webapp.surveys.demo.Model.SurveyModel;

@RestController
public class SurveyControllerREST {
	
	@Autowired
	SurveyRepo repo;
	
	@GetMapping("/api/getAll")
	public List<SurveyModel> home() {
		return repo.findAll();
	}
}
