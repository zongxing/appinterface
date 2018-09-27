package com.mashensoft.srdj.app.interceptor;

import java.util.Enumeration;
import java.util.Scanner;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LogIntercepter implements HandlerInterceptor {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("开始执行log...");
		Enumeration<String> enu = request.getParameterNames();
		logger.debug("访问路径："+request.getRequestURL().toString());
		logger.debug("访问参数："+request.getQueryString());
		logger.debug("访问明细如下：");
		while(enu.hasMoreElements()){
			String key = enu.nextElement();
			String value=  request.getParameter(key);
			logger.debug(key+"="+value);
		}
		Scanner s = new Scanner(request.getInputStream());
		StringBuffer sb = new StringBuffer();
		while(s.hasNextLine()) {
			sb.append(s.nextLine());
		}
		if(sb.toString().length()!=0) {
			logger.debug(sb.toString());
		}
		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
