package com.jenkins.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jenkins")
public class JenkinsController {

	@PostMapping
	public String createData() {
		System.out.println("Welcome to Jenkins, Here you will learn about Github Build using Poll SCM");
		return "Welcome to Jenkins";
	}
}
