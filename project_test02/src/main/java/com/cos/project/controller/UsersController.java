package com.cos.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {
	
	@GetMapping("/auth/joinForm")
	public String joinForm() {
		return "user/joinForm";
	}
	
	@GetMapping("/auth/loginForm")
	public String loginForm() {
		return "user/loginForm";
	}
	@GetMapping("/auth/findId")
	public String findId() {
		return "user/findId";
	}
	@GetMapping("/auth/modifyPwd")
	public String modifyPwd() {
		return "user/modifyPwd";
	}
	
	//유저 수정 폼 jsp있으면
	
	/*
	 * @GetMapping("/user/updateForm") public String updateForm() {
	 * return"user/updateForm"; }
	 */
}