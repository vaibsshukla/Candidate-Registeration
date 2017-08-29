package org.job.registeration.interceptors;

import java.util.Enumeration;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.job.registeration.config.SpringMvcConfig;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class RegisterInterceptor implements HandlerInterceptor{

	private static final Logger logger = Logger.getLogger(SpringMvcConfig.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		logger.debug("Pre Handle");
		HttpSession session = request.getSession();
		Enumeration<String> e = request.getAttributeNames();
		while(e.hasMoreElements()){
			logger.debug(e.nextElement());			
		}

		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.debug("post handle");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {		
		logger.debug("after completetion");
	}

}
