package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.domain.User;

@Controller
public class UserController {
	@RequestMapping("/submit")
	public ModelAndView showreg() {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("regform");
		return mv;
	}

	@RequestMapping(value="/registeruser"  ,method=RequestMethod.POST)
	public ModelAndView result(User user) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("use", user);
		mv.setViewName("result");
		return mv ;
		
	}
}
