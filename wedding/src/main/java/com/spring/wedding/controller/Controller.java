package com.spring.wedding.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.wedding.service.User_infoService;

@org.springframework.stereotype.Controller
public class Controller {

		@Autowired
		private User_infoService us;
}
