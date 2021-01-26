package com.oldways.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("page");
		mav.addObject("greeting", "Welcome to draft pages of OnlineShopping");
		return mav; 
	}
	
//	@RequestMapping(value="/test")
//	public ModelAndView testGreeting(@RequestParam(value = "greeting", required=false)String greeting) {
//		if(null == greeting) {
//			greeting = "Hello There";
//		}
//		ModelAndView mav = new ModelAndView("page");
//		mav.addObject("greeting", greeting);
//		return mav;
//	}

//	@RequestMapping(value="/test/{greeting}")
//	public ModelAndView testGreeting(@PathVariable("greeting")String greeting) {
//		if(null == greeting) {
//			greeting = "Hello There";
//		}
//		ModelAndView mav = new ModelAndView("page");
//		mav.addObject("greeting", greeting);
//		return mav;
//	}
}
