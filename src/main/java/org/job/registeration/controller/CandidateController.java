package org.job.registeration.controller;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.groups.Default;

import org.apache.log4j.Logger;
import org.job.registeration.loggerc.Colors;
import org.job.registeration.model.Candidate;
import org.job.registeration.model.Candidate.Step1;
import org.job.registeration.model.Candidate.Step2;
import org.job.registeration.model.Candidate.optional;
import org.job.registeration.model.CandidateContactDetail;
import org.job.registeration.model.CandidateDetail;
import org.job.registeration.model.CandidateDisabilityDetail;
import org.job.registeration.validators.SqlDateEditor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("form1")
public class CandidateController {
	
	private static final Logger logger = Logger.getLogger(CandidateController.class);
	
	@Autowired
	private HttpServletRequest request;

	@Autowired
	private Validator validator;
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setLenient(true);
		binder.registerCustomEditor(java.sql.Date.class, new SqlDateEditor(sdf));
	}
	
	@ModelAttribute("form1")
	public Candidate getForm1(){
		CandidateContactDetail ccd = new CandidateContactDetail();
		CandidateDetail detail = new CandidateDetail();
		CandidateDisabilityDetail cdd = new CandidateDisabilityDetail();
	
		Candidate candidate = new Candidate();
		candidate.setCandidateContactDetail(ccd);
		candidate.setCandidateDetail(detail);
		candidate.setCandidateDisabilityDetail(cdd);
		return candidate;
	}

	@RequestMapping(value="/")
	public String home(){
		logger.debug("request is redirected here");
		getForm1();
		return "home";
	}

	@RequestMapping(value="/step1", method=RequestMethod.POST, produces="application/json")
	@ResponseBody
	public ResponseEntity<?> Step1(@Validated({Default.class}) @RequestBody Candidate candidate, BindingResult result){
		HttpSession session = request.getSession();
		session.setAttribute("form1", candidate);
		logger.debug("Session :->" +session.getAttribute("form1"));
		logger.debug(candidate);
		logger.debug(result);
		if(result.hasErrors())
		{
			logger.debug("Error caught");
			return new ResponseEntity<>(jsonResult(result),HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(jsonResult(result),HttpStatus.ACCEPTED);
	}	
	
	@RequestMapping(value="/step2", method=RequestMethod.POST, produces="application/json")
	@ResponseBody
	public ResponseEntity<?> Step2(@Validated({Step1.class, Default.class}) @RequestBody CandidateContactDetail ccd, BindingResult result){
		logger.debug("****************************Step2************************");
		logger.debug(ccd);
		logger.debug(result);
		if(result.hasErrors())
		{
			logger.debug("Error caught");
			return new ResponseEntity<>(jsonResult(result),HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(jsonResult(result),HttpStatus.ACCEPTED);
	}	

	@RequestMapping(value="/step3", method=RequestMethod.POST, produces="application/json")
	@ResponseBody
	public ResponseEntity<?> Step3(@Validated({Step2.class, optional.class}) @RequestBody Candidate candidate, BindingResult result){
		logger.debug(Colors.ANSI_GREEN+"****************************Step3************************");
		logger.debug(Colors.ANSI_GREEN+candidate);
		logger.debug(Colors.ANSI_RED+result);
		if(result.hasErrors())
		{
			logger.debug("Error caught");
			return new ResponseEntity<>(jsonResult(result),HttpStatus.BAD_REQUEST);
		}
		logger.debug(candidate.getCandidateDetail());
		if(candidate.getCandidateDetail().getIsCandidateHandicapped()==1){
			CandidateDisabilityDetail cdd = candidate.getCandidateDisabilityDetail();
			validator.validate(cdd, result);
			logger.debug(cdd);
			logger.debug(Colors.ANSI_CYAN+result);
			if(result.hasErrors()){
				return new ResponseEntity<>(jsonResult(result),HttpStatus.BAD_REQUEST);
			}
		}
		return new ResponseEntity<>(jsonResult(result),HttpStatus.ACCEPTED);
	}	

	@RequestMapping(value="/success", method=RequestMethod.GET)
	public String Success(){
		logger.debug("succes");
		return "Success";
	}

	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String Register(@ModelAttribute("form1") Candidate candidate){
		logger.debug("****************************Step Final****************************");
		logger.debug(candidate);
		return "redirect:/success";
	}	

	private Map<String, String> jsonResult(final BindingResult result){
		return new HashMap<String, String>(){{
			
			for(FieldError er : result.getFieldErrors()){
				put(er.getField(), er.getDefaultMessage());
			}
		}};
	}
	
}
