package com.wondersgroup.avenue.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wondersgroup.avenue.model.UserPeer;
import com.wondersgroup.avenue.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	public LoginController(){
	}
	
	@RequestMapping(value = "/login/{loginName}", method = RequestMethod.GET)
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response,
			@PathVariable("loginName") String loginName, ModelMap modelMap) throws Exception {
		modelMap.put("user", buildUser(loginName));
		return new ModelAndView("/login/hello",modelMap);		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String listUser(Model model){
		model.addAttribute("user", userService.getAllUser());
		return "user/adminUserList";
	}
	
	@RequestMapping(value="/welcome",method = RequestMethod.POST)
	public String registerPost(){
		return "/welcome";
	}
	
	public UserPeer buildUser(String loginName){
		UserPeer user = new UserPeer();
		user.setLoginName(loginName);
		user.setPassword("8888");
		return user;
	}
}