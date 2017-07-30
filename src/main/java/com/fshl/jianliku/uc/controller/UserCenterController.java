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
	
	@RequestMapping("jianli/detail")
	public ModelAndView jianliDetail(int jlId){
		
		return new ModelAndView("uc/jianli_detail");
	}

	@RequestMapping("comm/list")
	public ModelAndView listComm(){
		
		return new ModelAndView("uc/comm_list");
	}
	
	@RequestMapping("comm/detail")
	public ModelAndView commDetail(int id){
		
		return new ModelAndView("uc/comm_detail");
	}
	
	@RequestMapping("balance/list")
	public ModelAndView listBalance(){
		
		return new ModelAndView("uc/balance_list");
	}
}
