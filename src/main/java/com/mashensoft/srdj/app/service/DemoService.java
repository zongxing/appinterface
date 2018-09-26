package com.mashensoft.srdj.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mashensoft.srdj.app.mapper.DemoMapper;
import com.mashensoft.srdj.app.model.Demo;

@Service
public class DemoService {
	@Autowired
	DemoMapper demoMapper;
	public List<Demo> getDemoList(){
		List<Demo> list = demoMapper.getDemoList();
		
		return list;
	}
}
