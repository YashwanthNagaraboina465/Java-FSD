package com.example.quiz.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "question")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int quesId;
	private String question;
	private String optionA;
	private String optionB;
	private String optionC;
	private int ans;
	private int chose;

	public int getQuesId() {
		return quesId;
	}

	public void setQuesId(int quesId) {
		this.quesId = quesId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOptionA() {
		return optionA;
	}

	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}

	public String getOptionB() {
		return optionB;
	}

	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}

	public String getOptionC() {
		return optionC;
	}

	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}

	public int getAns() {
		return ans;
	}

	public void setAns(int ans) {
		this.ans = ans;
	}

	public int getChose() {
		return chose;
	}

	public void setChose(int chose) {
		this.chose = chose;
	}

	@Override
	public String toString() {
		return "Question [quesId=" + quesId + ", question=" + question + ", optionA=" + optionA + ", optionB=" + optionB
				+ ", optionC=" + optionC + ", ans=" + ans + ", chose=" + chose + "]";
	}

	
}