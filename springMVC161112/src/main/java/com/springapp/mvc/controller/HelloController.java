package com.springapp.mvc.controller;

import com.springapp.mvc.beans.User;
import com.springapp.mvc.service.IserieTry01;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class HelloController {


	@RequestMapping(method = RequestMethod.GET , value = "/")
	public String printWelcome(Model model) {
		model.addAttribute("path","http://127.0.0.1:8080");
		User user = new User("testName","thisispassword");
		model.addAttribute("user", user);
		return "index";
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "/messageReturn")
	public void messageReturn(HttpServletRequest request,Model model){
		model.addAttribute("testOne","this is try");
		model.addAttribute("testTwo","the second params");
	}

	public static void main(String[] args) {
		List<User> userList = new ArrayList<User>();
		for(int i = 0; i < 200; i++){
			User user = new User("name" + i, "password" + i);
			userList.add(user);
		}
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("/src/main/webapp/WEB-INF/mvc-dispatcher-try-servlet.xml");
		IserieTry01 iserieTry01 = (IserieTry01) applicationContext.getBean("srieTry01");
		List<User> userList1 = iserieTry01.getAllUser();
		iserieTry01.addUserList(userList);
	}

}