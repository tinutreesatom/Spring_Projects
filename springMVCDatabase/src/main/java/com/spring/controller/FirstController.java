package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.dao.UserDao;
import com.spring.model.Login;
import com.spring.model.User;
import com.spring.service.UserService;

@Controller
public class FirstController {
	@RequestMapping(value="/")
	public ModelAndView index() {
		ModelAndView mv=new ModelAndView("home");
		return mv;
	}
	@Autowired UserDao userDao;	
	@RequestMapping(value="/login")
	public ModelAndView login() {
		ModelAndView mv=new ModelAndView("login");
		return mv;
	}
	@Autowired UserService userService;
	@RequestMapping(value="/register")
	public ModelAndView register() {
		ModelAndView mv=new ModelAndView("register");
		return mv;
	}
	
	@RequestMapping(value="/registerProcess", method = RequestMethod.POST)
	public ModelAndView adduser(HttpServletRequest request,HttpServletResponse response,User user)
	{
		//Collect Data from form and send to bo class
		userService.register(user);
		return new ModelAndView("welcome","name",user.getFirstname());
	}
	//Action Performed when Login Submit button clicks
	@RequestMapping(value="/loginprocess",method = RequestMethod.POST)
	public ModelAndView loginprocess(HttpServletRequest request,HttpServletResponse response,Login login)
	{
		ModelAndView mav=null;
		User user=userService.validateUser(login);
		if(null!=user)
		{
			//when data is available redirect to home page with username
			mav=new ModelAndView("welcome");
			mav.addObject("name", user.getUsername());
		}
		else
		{
			//when data is not available redirect to login page with Error
			mav=new ModelAndView("login");
			mav.addObject("message","Username or password is wrong !");
		}
		return mav;
	}
}

