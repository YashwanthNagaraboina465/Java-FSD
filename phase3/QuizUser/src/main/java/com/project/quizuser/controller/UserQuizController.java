package com.project.quizuser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.project.quizuser.Repo.QuizPageRepository;
import com.project.quizuser.Repo.ScoreCompareRepository;
import com.project.quizuser.dto.Answer;
import com.project.quizuser.dto.Questions;
import com.project.quizuser.dto.Quiz;
import com.project.quizuser.entity.QuizPage;

@Controller
@RequestMapping("/quiz")
public class UserQuizController {
	@Autowired
	private QuizPageRepository repo;

	@Autowired
	private ScoreCompareRepository srepo;

	private RestTemplate restTemplate = new RestTemplate();

	@RequestMapping(value = "/showpage", method = RequestMethod.GET)
	public String ShowCreateQuizPage(ModelMap model) {
		model.addAttribute("QuizPages", repo.findAll());
		List<Quiz> quiz = (List<Quiz>) restTemplate.getForObject("http://localhost:8082/quiz", List.class);
		model.addAttribute("quiz", quiz);
		List<Questions> ques = (List<Questions>) restTemplate.getForObject("http://localhost:8082/question",
				List.class);
		model.addAttribute("ques", ques);
		return "showAddQuizPage";
	}

	@RequestMapping(value = "/addtoquiz", method = RequestMethod.POST)
	public String addToquiz(@ModelAttribute("shoppingCart") QuizPage qp, ModelMap model) {
		repo.save(qp);
		model.addAttribute("QuizPages", repo.findAll());
		List<Quiz> quiz = (List<Quiz>) restTemplate.getForObject("http://localhost:8082/quiz", List.class);
		model.addAttribute("quiz", quiz);
		List<Questions> ques = (List<Questions>) restTemplate.getForObject("http://localhost:8082/question",
				List.class);
		model.addAttribute("ques", ques);
		return "showAddQuizPage";
	}

	@RequestMapping("/showQuizPage")
	public String showQuizPage(ModelMap model) {
		List<Quiz> quiz = (List<Quiz>) restTemplate.getForObject("http://localhost:8082/quiz", List.class);
		model.addAttribute("quiz", quiz);
		return "showQuizStartPage";
	}

	@RequestMapping("/{quizname}")
	public String showTestPage(@PathVariable("quizname") String quizname, ModelMap model) {
		List<Questions> ques = (List<Questions>) restTemplate.getForObject("http://localhost:8082/question",
				List.class);
		model.addAttribute("ques", ques);
		List<Quiz> quiz = (List<Quiz>) restTemplate.getForObject("http://localhost:8082/quiz", List.class);
		model.addAttribute("quiz", quiz);
		List<Answer> answer = (List<Answer>) restTemplate.getForObject("http://localhost:8082/answer", List.class);
		model.addAttribute("answer", answer);
		return "javaQuiz";
	}
//compare
	@RequestMapping("/cppQuiz")
	public String showTestPage1(@PathVariable("quizname") String quizname, ModelMap model) {
		List<Questions> ques = (List<Questions>) restTemplate.getForObject("http://localhost:8082/question",
				List.class);
		model.addAttribute("ques", ques);
		List<Quiz> quiz = (List<Quiz>) restTemplate.getForObject("http://localhost:8082/quiz", List.class);
		model.addAttribute("quiz", quiz);
		List<Answer> answer = (List<Answer>) restTemplate.getForObject("http://localhost:8082/answer", List.class);
		model.addAttribute("answer", answer);
		return "cppQuiz";
	}

	@RequestMapping("/result")

	public String viewResult1(ModelMap model) {
		model.addAttribute("scores", srepo.findAll());
		return "final";
	}

}
