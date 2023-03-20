package com.webapp.surveys.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webapp.surveys.demo.DAO.SurveyRepo;
import com.webapp.surveys.demo.Model.SurveyModel;

@Controller 
public class SurveyController {
	
	@Autowired
	SurveyRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "welcome";
	}
	
	@RequestMapping("/addSurvey")
	public String addSurvey(SurveyModel model) {
		repo.save(model);
		
		return "success";
	}
	
}
