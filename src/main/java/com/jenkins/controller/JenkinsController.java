package com.jenkins.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/jenkins")
public class JenkinsController {

	@PostMapping
	public String createData() {
		System.out.println("Welcome to Jenkins, Here you will learn about Github Build using Poll SCM");
		return "Welcome to Jenkins";
	}

	@GetMapping
	public void getData(){
		System.out.println("Getting data from Jenkins");
	}
}
