package com.babycity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/play")
public class PlayController {

	@GetMapping
	public ModelAndView list() {
		System.out.println("asdfasdf");
		return new ModelAndView("messages/list", "messages", "ddddd");
	}

}
