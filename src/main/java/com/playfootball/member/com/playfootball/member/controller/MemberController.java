package com.playfootball.member.com.playfootball.member.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class MemberController {


	@GetMapping(value = "/login")
	public ResponseEntity<String> login() {
		return ResponseEntity.ok("tablenine");
	}
}
