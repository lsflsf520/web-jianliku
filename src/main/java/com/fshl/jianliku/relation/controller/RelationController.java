package com.fshl.jianliku.relation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("relation")
public class RelationController {
	
	@RequestMapping("index")
	public ModelAndView toIndex(){
		
		return new ModelAndView("relation/index");
	}

}
