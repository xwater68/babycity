package com.babycity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.babycity.entity.Play;
import com.babycity.service.PlayService;

@Controller
@RequestMapping("/play")
public class PlayController {

	@Autowired
	private PlayService playService;
	
	@GetMapping
	public ModelAndView list() {
		List<Play> list=playService.list();
		for(Play play:list){
			System.out.println(play.getTitle());
		}
		return new ModelAndView("play/list", "list", list);
	}

}
