package org.job.registeration.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CandidateController {
	
	private static final Logger logger = Logger.getLogger(CandidateController.class);
	
	@RequestMapping("/")
	public String Home(){
		logger.debug("hello");
		return "home";
	}
	
	@RequestMapping(value="/next", method=RequestMethod.POST)
	@ResponseBody
	public String Next(@RequestParam("get_param") String str){
		logger.debug(str);
		return "hie";
	}
}
