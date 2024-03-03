package com.skilldistillery.pokertracker.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Tournament {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tournamentId;

	@ManyToOne
	@JoinColumn(name = "playerId")
	private Player player;

	private LocalDate date;

	private BigDecimal buyInAmount;

	private int entries;

	private BigDecimal cashOut;

	private int totalEntrants;

	private BigDecimal prizePool;

	private int finishedPosition;

	private BigDecimal roi;

	// Assuming ITMPercentage is calculated and not stored
	public Tournament() {
	}

	public int getTournamentId() {
		return tournamentId;
	}

	public void setTournamentId(int tournamentId) {
		this.tournamentId = tournamentId;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public BigDecimal getBuyInAmount() {
		return buyInAmount;
	}

	public void setBuyInAmount(BigDecimal buyInAmount) {
		this.buyInAmount = buyInAmount;
	}

	public int getEntries() {
		return entries;
	}

	public void setEntries(int entries) {
		this.entries = entries;
	}

	public BigDecimal getCashOut() {
		return cashOut;
	}

	public void setCashOut(BigDecimal cashOut) {
		this.cashOut = cashOut;
	}

	public int getTotalEntrants() {
		return totalEntrants;
	}

	public void setTotalEntrants(int totalEntrants) {
		this.totalEntrants = totalEntrants;
	}

	public BigDecimal getPrizePool() {
		return prizePool;
	}

	public void setPrizePool(BigDecimal prizePool) {
		this.prizePool = prizePool;
	}

	public int getFinishedPosition() {
		return finishedPosition;
	}

	public void setFinishedPosition(int finishedPosition) {
		this.finishedPosition = finishedPosition;
	}

	public BigDecimal getRoi() {
		return roi;
	}

	public void setRoi(BigDecimal roi) {
		this.roi = roi;
	}

	@Override
	public String toString() {
		return "Tournament [tournamentId=" + tournamentId + ", player=" + player + ", date=" + date + ", buyInAmount="
				+ buyInAmount + ", entries=" + entries + ", cashOut=" + cashOut + ", totalEntrants=" + totalEntrants
				+ ", prizePool=" + prizePool + ", finishedPosition=" + finishedPosition + ", roi=" + roi + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(tournamentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tournament other = (Tournament) obj;
		return tournamentId == other.tournamentId;
	}

}
