package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.imple.Ownerclass;

@Controller
public class ownercontroller {
	
	private final Ownerclass ownerclass;

	public ownercontroller(Ownerclass ownerclass) {
		super();
		this.ownerclass = ownerclass;
	}
	@RequestMapping({"","/","/index"})
	public String getIndexPage(Model model) {
		
		model.addAttribute("owners", ownerclass.getOwner());
		return "index";
	}

}
