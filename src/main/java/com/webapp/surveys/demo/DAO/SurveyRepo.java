package com.webapp.surveys.demo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webapp.surveys.demo.Model.SurveyModel;

public interface SurveyRepo extends JpaRepository<SurveyModel, Integer>{
	List<SurveyModel> findByName(String name);
}
