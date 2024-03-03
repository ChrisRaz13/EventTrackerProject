package com.skilldistillery.pokertracker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skilldistillery.pokertracker.entities.Tournaments;
import com.skilldistillery.pokertracker.repositories.TournamentRepository;

@Service
public class TournamentServiceImpl implements TournamentService {

    @Autowired
    private TournamentRepository tournamentRepo;

    @Override
    public List<Tournaments> index() {
        return tournamentRepo.findAll();
    }

    @Override
    public Tournaments findTournamentById(int id) {
        Optional<Tournaments> tournamentOpt = tournamentRepo.findById(id);
        return tournamentOpt.orElse(null);
    }

    @Override
    @Transactional
    public Tournaments saveTournament(Tournaments tournaments) {
        return tournamentRepo.save(tournaments);
    }

    @Override
    @Transactional
    public Tournaments updateTournament(int id, Tournaments tournament) {
        if (tournamentRepo.existsById(id)) {
            tournament.setTournamentId(id); // Assuming you have a setter method for the ID
            return tournamentRepo.save(tournament);
        }
        return null; 
    }

    @Override
    @Transactional
    public boolean deleteTournament(int id) {
        if (tournamentRepo.existsById(id)) {
            tournamentRepo.deleteById(id);
            return true;
        }
        return false;
    }

    // Implement other methods defined in TournamentService, if any
}
