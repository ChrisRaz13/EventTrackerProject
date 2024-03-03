package com.skilldistillery.pokertracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.pokertracker.entities.Tournaments;
import com.skilldistillery.pokertracker.services.TournamentService;

@RestController
@RequestMapping("/api/tournaments")
public class TournamentsController {

    @Autowired
    private TournamentService tournamentService;

    // List all tournaments
    @GetMapping
    public ResponseEntity<List<Tournaments>> index() {
        List<Tournaments> tournaments = tournamentService.index();
        return new ResponseEntity<>(tournaments, HttpStatus.OK);
    }

    // Get a specific tournament by ID
    @GetMapping("/{id}")
    public ResponseEntity<Tournaments> getTournamentsById(@PathVariable int id) {
        Tournaments tournament = tournamentService.findTournamentById(id);
        if (tournament == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(tournament, HttpStatus.OK);
    }

    // Create a new tournament
    @PostMapping
    public ResponseEntity<Tournaments> addTournaments(@RequestBody Tournaments tournament) {
        tournament = tournamentService.saveTournament(tournament);
        return new ResponseEntity<>(tournament, HttpStatus.CREATED);
    }

    // Update an existing tournament
    @PutMapping("/{id}")
    public ResponseEntity<Tournaments> updateTournaments(@PathVariable int id, @RequestBody Tournaments tournament) {
        tournament = tournamentService.updateTournament(id, tournament);
        if (tournament == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(tournament, HttpStatus.OK);
    }

    // Delete a tournament
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTournaments(@PathVariable int id) {
        boolean deleted = tournamentService.deleteTournament(id);
        if (!deleted) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
