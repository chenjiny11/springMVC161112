package com.springapp.mvc;

import com.sun.deploy.net.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET , value = "/")
	public String printWelcome(Model model) {
		model.addAttribute("path","http://127.0.0.1:8080");
		return "index";
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "/messageReturn")
	public void messageReturn(HttpServletRequest request,Model model){
		model.addAttribute("testOne","this is try");
		model.addAttribute("testtwo","this is try two");
		model.addAttribute("testTwo","the second params");
	}


}