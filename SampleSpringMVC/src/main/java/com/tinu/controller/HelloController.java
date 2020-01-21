package com.tinu.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {
	//System.out.println("hello");
	@RequestMapping(value="/")
	public String index() {
		return "index";
	}
	@RequestMapping(value="/login")
	public String login() {
		return "login";
	}
	@RequestMapping(value="/register")
	public String register() {
		return "register";
	}
	@RequestMapping(value="/welcome")
	public ModelAndView display(HttpServletRequest request, HttpServletResponse response)
	{
	String name = request.getParameter("unameTxt");
//	String password = request.getParameter("t2");
	ModelAndView mv = new ModelAndView();
	mv.setViewName("welcome");
	mv.addObject("name", name);
	return mv;
	}
}
