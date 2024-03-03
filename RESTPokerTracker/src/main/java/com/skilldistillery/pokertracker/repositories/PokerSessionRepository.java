package com.skilldistillery.codingtracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skilldistillery.codingtracker.entities.CodingSession;

public interface CodingSessionRepository extends JpaRepository<CodingSession, Integer> {

}
