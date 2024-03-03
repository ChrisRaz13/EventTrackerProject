package com.skilldistillery.pokertracker.services;

import java.util.List;

import com.skilldistillery.pokertracker.entities.Tournaments;

public interface TournamentService {
	List<Tournaments> index();

	Tournaments findTournamentById(int id);

	Tournaments saveTournament(Tournaments tournaments);

	Tournaments updateTournament(int id, Tournaments tournament);

	boolean deleteTournament(int id);
}
