package com.fshl.jianliku.uc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("uc")
public class UserCenterController {
	
	@RequestMapping("index")
	public ModelAndView toucindex(){
		
		return new ModelAndView("uc/index");
	}
	
	@RequestMapping("jianli/list")
	public ModelAndView listMyjianli(){
		
		return new ModelAndView("uc/jianli_list");
	}

}
