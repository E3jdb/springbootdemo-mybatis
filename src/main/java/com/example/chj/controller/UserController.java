package com.example.chj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.chj.mapper.UserMapper;

@RestController
public class UserController {

	
	@Autowired
	UserMapper userMapper;
	
	
}
