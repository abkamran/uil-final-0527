package com.uil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uil.service.OrderService;

@Controller
public class FrontControl {

	@Autowired
	private OrderService orderService;

	@RequestMapping("/index")
	public String index() {
		return "index";
	}

}
