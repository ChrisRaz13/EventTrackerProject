package com.skilldistillery.pokertracker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skilldistillery.pokertracker.entities.Player;
import com.skilldistillery.pokertracker.repositories.PlayerRepository;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRepo;

    @Override
    public List<Player> index() {
        return playerRepo.findAll();
    }

    @Override
    public Player findPlayerById(int id) {
        Optional<Player> playerOpt = playerRepo.findById(id);
        return playerOpt.orElse(null);
    }

    @Override
    @Transactional
    public Player savePlayer(Player player) {
        return playerRepo.save(player);
    }

    @Override
    @Transactional
    public Player updatePlayer(int id, Player player) {
        if (playerRepo.existsById(id)) {
            player.setPlayerId(id); 
            return playerRepo.save(player);
        }
        return null; 
    }

    @Override
    @Transactional
    public boolean deletePlayer(int id) {
        if (playerRepo.existsById(id)) {
            playerRepo.deleteById(id);
            return true;
        }
        return false;
    }
}
