package com.skilldistillery.codingtracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.codingtracker.entities.CodingSession;
import com.skilldistillery.codingtracker.services.CodingSessionService;

@RequestMapping("api")
@RestController
public class CodingSessionController {

	@Autowired
	private CodingSessionService csService;
	
	@GetMapping("sessions")
	public List<CodingSession> index() {
		return csService.index();
	}
}
