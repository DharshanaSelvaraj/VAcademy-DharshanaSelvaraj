package com.lgn.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class TeacherController {
	  
	@RequestMapping("/test")
	public ModelAndView test(HttpServletRequest req , HttpServletResponse res) throws IOException{
	return new ModelAndView("test");
	}
	@RequestMapping("/chat")
	public ModelAndView chat(HttpServletRequest req , HttpServletResponse res) throws IOException{
	return new ModelAndView("chat");
	}

}
