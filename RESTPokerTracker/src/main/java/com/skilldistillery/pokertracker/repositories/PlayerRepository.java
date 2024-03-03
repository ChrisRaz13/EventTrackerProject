package com.skilldistillery.pokertracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skilldistillery.pokertracker.entities.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer>{

}
