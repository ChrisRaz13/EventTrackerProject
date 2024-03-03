package com.skilldistillery.pokertracker.entities;


import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int playerId;

    private String name;

    private int ranking;

    @OneToMany(mappedBy = "player")
    private List<Tournaments> tournaments;

    public Player() {
    }

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public List<Tournaments> getTournaments() {
		return tournaments;
	}

	public void setTournaments(List<Tournaments> tournaments) {
		this.tournaments = tournaments;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", name=" + name + ", ranking=" + ranking + ", tournaments="
				+ tournaments + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(playerId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return playerId == other.playerId;
	}
    
}
