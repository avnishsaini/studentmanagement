package com.studentbackend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class student {
	@RequestMapping(value = "/getname", method=RequestMethod.GET)
	public String getName() {
		return "Hello Avnish";
	}
}
