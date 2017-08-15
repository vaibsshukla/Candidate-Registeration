package org.job.registeration.controller;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.job.registeration.loggerc.Colors;
import org.job.registeration.model.CandidateContactDetail;
import org.job.registeration.model.CandidateDetail;
import org.job.registeration.model.CandidateDisabilityDetail;
import org.job.registeration.model.CandidatePersonalDetail;
import org.springframework.boot.ansi.AnsiColor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CandidateController {
	
	private static final Logger logger = Logger.getLogger(CandidateController.class);
	
	public CandidatePersonalDetail getModel(){
		CandidateContactDetail ccdetail = new CandidateContactDetail();
		CandidateDetail cdetail = new CandidateDetail();
		CandidateDisabilityDetail cddetail = new CandidateDisabilityDetail();
		CandidatePersonalDetail cpdetail = new CandidatePersonalDetail();
		cpdetail.setCandidateContactDetail(ccdetail);
		cpdetail.setCandidateDetail(cdetail);
		cpdetail.setCandidateDisabilityDetail(cddetail);
		
		return cpdetail;
	}
	@RequestMapping("/")
	public String Home(Model model){
		model.addAttribute("form", getModel());
		return "home";
	}
	
	@RequestMapping(value="/next", method=RequestMethod.POST)
//	@ResponseBody@RequestParam("get_param") String str, 
	public String Next (@ModelAttribute ("form") @Valid CandidatePersonalDetail cpd, BindingResult result, Model model){
		logger.debug(model);
		if(result.hasErrors()){
//			model.addAttribute("form", cpd);
			return "home";
		}
		return "home";
	}
}
