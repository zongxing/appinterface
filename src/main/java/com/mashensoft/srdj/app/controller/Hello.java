package com.mashensoft.srdj.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mashensoft.srdj.app.common.ResponseObject;
import com.mashensoft.srdj.app.service.DemoService;

@RestController
public class Hello {
	@Autowired
	DemoService demoService;

	@RequestMapping("/getPerson2")
	public ResponseObject getPerson2() {
		ResponseObject ro = new ResponseObject();
		ro.setResCode("101");
		ro.setResDesc("无法连接数据库");
		ro.setResData(new Person(200,"hello"));
		return ro;
	}
	@RequestMapping("/getDemo")
	public ResponseObject getDemo() {
		ResponseObject ro = new ResponseObject();
		ro.setResCode("101");
		ro.setResDesc("无法连接数据库");
		ro.setResData(demoService.getDemoList());
		return ro;
	}
}
class Person{
	private Integer id;
	private String name;
	
	public Person(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
