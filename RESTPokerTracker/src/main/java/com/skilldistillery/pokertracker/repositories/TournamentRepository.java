package com.skilldistillery.pokertracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skilldistillery.pokertracker.entities.Tournaments;

public interface TournamentRepository extends JpaRepository<Tournaments, Integer>{

}
