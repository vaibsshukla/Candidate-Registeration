package org.job.registeration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CandidateController {
	
	@RequestMapping("/")
	public String Home(){
		return "home";
	}
}
