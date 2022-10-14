package com.example.quiz.controllers;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.quiz.entity.Admin;
import com.example.quiz.entity.Question;
import com.example.quiz.entity.QuestionForm;
import com.example.quiz.entity.Result;
import com.example.quiz.entity.User;
import com.example.quiz.repositories.AuthenticationAdminRepository;
import com.example.quiz.repositories.AuthenticationUserRepository;
import com.example.quiz.repositories.ParticipantRepository;
import com.example.quiz.repositories.QuestionRepo;
import com.example.quiz.services.AuthenticationAdminService;
import com.example.quiz.services.AuthenticationUserService;
import com.example.quiz.services.QuizService;

@Controller
public class MainController {
	Logger logger = LoggerFactory.getLogger(MainController.class);

	@Autowired
	AuthenticationUserService userAuthService;
	
	@Autowired
	AuthenticationAdminService adminAuthService;
	
	@Autowired
	AuthenticationUserRepository userAuthRepo;
	
	@Autowired
	AuthenticationAdminRepository adminAuthRepo;
	
	@Autowired
	ParticipantRepository participantRepo;
	
	@Autowired
	QuestionRepo quizRepo;
	
	@Autowired
	Result result;
	
	@Autowired
	QuizService qService;
	
	Boolean submitted = false;
    
    @GetMapping("/home")
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
    	return mv;
    }

	@GetMapping("/admin")
	public ModelAndView admin() {
		ModelAndView mv = new ModelAndView();
        mv.setViewName("admin");
		return mv;
	}
	
	@GetMapping("/participant")
	public ModelAndView participant() {
		ModelAndView mv = new ModelAndView();
        mv.setViewName("participant");
		return mv;
	}
	
	@RequestMapping("/loginUser")
	public ModelAndView loginParticipant() {
		ModelAndView mv = new ModelAndView();
        mv.setViewName("loginUser");
		return mv;
	}
	
	@RequestMapping("/loginAdmin")
	public ModelAndView loginAdmin() {
		ModelAndView mv = new ModelAndView();
        mv.setViewName("loginAdmin");
		return mv;
	}
	
	@RequestMapping("/createQuiz")
	public ModelAndView createQuiz() {
		ModelAndView mv = new ModelAndView();
        mv.setViewName("createquiz");
		return mv;
	}
	
	@RequestMapping("/access")
	public ModelAndView accessPage() {
		ModelAndView mv = new ModelAndView();
        mv.setViewName("access");
		return mv;
	}
	
	@RequestMapping("/updateQuiz")
	public ModelAndView updateQuiz() {
		ModelAndView mv = new ModelAndView();
        mv.setViewName("updatequiz");
		return mv;
	}
	
	@RequestMapping("/deleteQuiz")
	public ModelAndView deleteQuiz() {
		ModelAndView mv = new ModelAndView();
        mv.setViewName("deletequiz");
		return mv;
	}
	
	@RequestMapping("/update")
	public ModelAndView updateAdminPassword() {
		ModelAndView mv = new ModelAndView();
        mv.setViewName("update");
		return mv;
	}
	
	@RequestMapping("/showParticipants")
	public ModelAndView showUsers() {
		ModelAndView mv = new ModelAndView();
        mv.setViewName("participantList");
		return mv;
	}
	
	
	@RequestMapping("/viewParticipantForm")
	public ModelAndView createQuizParticipant() {
		ModelAndView mv = new ModelAndView();
        mv.setViewName("quizparticipant");
		return mv;
	}
	
	@RequestMapping("/quiz")
	public ModelAndView quiz() {
		ModelAndView mv = new ModelAndView();
        mv.setViewName("quiz");
		return mv;
	}
	
	@RequestMapping("/score")
	public ModelAndView Score() {
		ModelAndView mv = new ModelAndView();
        mv.setViewName("scoreboard");
		return mv;
	}
	
	@RequestMapping("/submit")
	public ModelAndView submit() {
		ModelAndView mv = new ModelAndView();
        mv.setViewName("result");
		return mv;
	}
	
	@RequestMapping("/validParticipant")
	public ModelAndView validParticipant() {
		ModelAndView mv = new ModelAndView();
        mv.setViewName("validParticipant");
		return mv;
	}
	
	@RequestMapping(value="/viewParticipantForm", method=RequestMethod.POST)
	public ModelAndView authenticateUser(@RequestParam("name") String name, @RequestParam("password") String pswd) {
		ModelAndView userLoginSuccess = new ModelAndView();
		userLoginSuccess.setViewName("userLoginSuccess");
		
		ModelAndView userNotFound = new ModelAndView();
		userNotFound.setViewName("userNotFound");
		User user = userAuthService.GetUserByName(name);
		if(userAuthService.isValidPassword(pswd, user.getPassword()))
			{
				return userLoginSuccess;
			}
		else {
			return userNotFound;
		}
		
	}  
	@RequestMapping(value="/viewAccess", method=RequestMethod.POST)
	public ModelAndView authenticateAdmin(@RequestParam("name") String name, @RequestParam("password") String pswd) {
		ModelAndView access = new ModelAndView();
		access.setViewName("access");
		
		ModelAndView adminNotFound = new ModelAndView();
		adminNotFound.setViewName("adminNotFound");
		Admin admin = adminAuthService.GetAdminByName(name);
		logger.info(admin.getName() + " attempted to login with " + admin.getPassword());
		if(adminAuthService.isValidPassword(pswd, admin.getPassword())) {
			return access;
		}
		else {
			return adminNotFound;
		}
		
	}  
	
	@RequestMapping(value="/createUser", method = RequestMethod.POST)
	public ModelAndView createParticipantAcc(@ModelAttribute("user") User user, ModelMap model) {
		ModelAndView loginUser = new ModelAndView();
		loginUser.setViewName("loginUser");
		
		userAuthRepo.save(user);
		return loginUser;
	}
	
	@RequestMapping(value="/createAdmin", method = RequestMethod.POST)
	public ModelAndView createAdminAcc(@ModelAttribute("admin") Admin admin, ModelMap model) {
		ModelAndView loginAdmin = new ModelAndView();
		loginAdmin.setViewName("loginAdmin");
		adminAuthRepo.save(admin);
		return loginAdmin;
	}
	
	
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public ModelAndView updateAdmin(@ModelAttribute("admin") Admin uiadmin, ModelMap model) {
		ModelAndView userNotFound = new ModelAndView();
		userNotFound.setViewName("userNotFound");
		
		ModelAndView updateSuccess = new ModelAndView();
		updateSuccess.setViewName("updateSuccess");
		
		Optional<Admin> optProduct = adminAuthRepo.findById(uiadmin.getId());
		if (optProduct.isEmpty()) {
			return userNotFound;
		}
		Admin dbAdmin = optProduct.get();
		dbAdmin.setName(uiadmin.getName());
		dbAdmin.setPassword(uiadmin.getPassword());
		adminAuthRepo.save(dbAdmin);
		model.addAttribute("users", adminAuthRepo.findAll());
		return updateSuccess;
	}
	
	@RequestMapping(value="/createQuiz", method=RequestMethod.POST)
	public ModelAndView createNewQuiz(@ModelAttribute("question") Question question, ModelMap model) {
		ModelAndView quizCreateSuccess = new ModelAndView();
		quizCreateSuccess.setViewName("quizCreateSuccess");
		
		quizRepo.save(question);
		return quizCreateSuccess;
	}
	
	@RequestMapping(value="/updateQuiz", method=RequestMethod.POST)
	public ModelAndView updateQuiz(@ModelAttribute("question") Question question, ModelMap model) {
		ModelAndView quizNotFound = new ModelAndView();
		quizNotFound.setViewName("quizNotFound");
		
		ModelAndView quizUpdateSuccess = new ModelAndView();
		quizUpdateSuccess.setViewName("quizUpdateSuccess");
		
		Optional<Question> optQuestion = quizRepo.findById(question.getQuesId());
		if(optQuestion.isEmpty()) {
			return quizNotFound;
		}
		Question dbQuiz = optQuestion.get();
		dbQuiz.setOptionA(question.getOptionA());
		dbQuiz.setOptionB(question.getOptionB());
		dbQuiz.setOptionC(question.getOptionC());
		dbQuiz.setAns(question.getAns());		
		dbQuiz.setChose(question.getChose());
		quizRepo.save(dbQuiz);
		model.addAttribute("quizzes", quizRepo.findAll());
		return quizUpdateSuccess;
	}
	
	@RequestMapping(value="/deleteQuiz", method=RequestMethod.POST)
	public ModelAndView deleteQuiz(@ModelAttribute("question") Question question, ModelMap model) {
		ModelAndView quizNotFound = new ModelAndView();
		quizNotFound.setViewName("quizNotFound");
		
		ModelAndView quizDeleteSuccess = new ModelAndView();
		quizDeleteSuccess.setViewName("quizDeleteSuccess");
		
		Optional<Question> optQuestion = quizRepo.findById(question.getQuesId());
		if(optQuestion.isEmpty()) {
			return quizNotFound;
		}
		Question dbQuiz = optQuestion.get();
		dbQuiz.setQuesId(question.getQuesId());
		quizRepo.delete(dbQuiz);
		return quizDeleteSuccess;
	}
	
////	@RequestMapping(value="/createQuizParticipant", method=RequestMethod.POST)
////	public ModelAndView createQuizParticipant(@ModelAttribute("participant") QuizParticipant participant, ModelMap mdoel) {
////		ModelAndView quiz = new ModelAndView();
////		quiz.setViewName("quiz");
////		
////		participantRepo.save(participant);
////		return quiz;
////	}	
//	
	
	@RequestMapping(value="/createQuizParticipant", method=RequestMethod.POST)
	public ModelAndView quiz(@RequestParam String name, Model m, RedirectAttributes ra, @ModelAttribute("question") Question question) {
		ModelAndView quizpage = new ModelAndView();
		quizpage.setViewName("quiz");
		
		ModelAndView validParticipant = new ModelAndView();
		validParticipant.setViewName("validParticipant");
		
		if(name.isBlank()) {
			ra.addFlashAttribute("warning", "You must enter your name");
			return validParticipant;
		}
		
		submitted = false;
		result.setUsername(name);
		
		QuestionForm qForm = qService.getQuestions();
		m.addAttribute("qForm", qForm);
		
		return quizpage;
	}
	
	  @PostMapping("/submit")
	    public ModelAndView submit(@ModelAttribute QuestionForm qForm, Model m) {
	        ModelAndView mv = new ModelAndView();
	        mv.setViewName("result");
	        if(!submitted) {
	            result.setTotalCorrect(qService.getResult(qForm));
	            qService.saveScore(result);
	            submitted = true;
	        }
	       
	        return mv;
	    }
	
	@GetMapping("/score")
	public ModelAndView score(Model m) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("scoreboard");
		List<Result> sList = qService.getTopScore();
		m.addAttribute("sList", sList);
		
		return mv;
	}

}
