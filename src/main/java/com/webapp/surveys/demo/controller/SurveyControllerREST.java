package com.webapp.surveys.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/api/getById/{id}")
	public Optional<SurveyModel> getById(@PathVariable ("id") int id ) {
		return repo.findById(id);
		
	}
	
	@GetMapping("/api/getByName/{name}")
	public List<SurveyModel> getByName(@PathVariable ("name") String name ) {
		return repo.findByName(name);
		
	}
}
