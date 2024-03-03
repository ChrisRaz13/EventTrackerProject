package com.skilldistillery.pokertracker.services;

import java.util.List;

import com.skilldistillery.pokertracker.entities.Player;

public interface PlayerService {
	List<Player> index();
	Player findPlayerById(int id);
	Player savePlayer(Player player);
	Player updatePlayer(int id, Player player);
	boolean deletePlayer(int id);
}
