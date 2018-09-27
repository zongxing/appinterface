package com.mashensoft.srdj.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mashensoft.srdj.app.common.ResponseObject;
import com.mashensoft.srdj.app.service.DemoService;

@RestController
@RequestMapping("/demo")
public class DemoController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	DemoService demoService;

	@RequestMapping("/getDemo")
	public ResponseObject getDemo() {
		ResponseObject ro = new ResponseObject();
		// ro.setResCode("100");
		// ro.setResDesc("成功");
		ro.setResData(demoService.getDemoList());
		logger.debug("demo res:-----------------");
		return ro;
	}
}
