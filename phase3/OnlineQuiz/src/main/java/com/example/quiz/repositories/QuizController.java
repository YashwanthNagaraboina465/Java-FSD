package com.example.quiz.repositories;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Quiz")
public class QuizController {
	
	@RequestMapping
	public String homepage() {
		
		return "homepage";
	}
	
	@RequestMapping(value="/User" , method=RequestMethod.POST)
	@ResponseBody
	public String page2() {
	
		return "homepage";
	}

}
