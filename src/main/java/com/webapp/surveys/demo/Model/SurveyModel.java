package com.webapp.surveys.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SurveyModel {

	@Id
	private String Name;
	private String Email;
	private String Age;
	private String Language;
	private String Comment;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	public String getComments() {
		return Comment;
	}
	public void setComments(String comments) {
		Comment = comments;
	}
	@Override
	public String toString() {
		return "SurveyRepo [Name=" + Name + ", Email=" + Email + ", Age=" + Age + ", Language=" + Language
				+ ", Comments=" + Comment + "]";
	}
	
}
