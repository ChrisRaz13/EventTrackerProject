package com.skilldistillery.codingtracker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilldistillery.codingtracker.entities.CodingSession;
import com.skilldistillery.codingtracker.repositories.CodingSessionRepository;

@Service
public class CodingSessionServiceImpl implements CodingSessionService {

	
		@Autowired
		private CodingSessionRepository repo;
		
		@Override
		public List<CodingSession> index() {
			return repo.findAll();
		}
}
