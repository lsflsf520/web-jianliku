package com.fshl.jianliku.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("sys/port")
public class PassportController {

	@RequestMapping("tologin")
	public ModelAndView tologin(){
		
		return new ModelAndView("sys/login");
	}
	
	@RequestMapping("toreg")
	public ModelAndView toreg(){
		
		return new ModelAndView("sys/reg");
	}
}
