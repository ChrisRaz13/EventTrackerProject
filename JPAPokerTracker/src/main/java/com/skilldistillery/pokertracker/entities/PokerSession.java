package com.skilldistillery.codingtracker.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "coding")
@Entity
public class CodingSession {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String coder;

	public CodingSession() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCoder() {
		return coder;
	}

	public void setCoder(String coder) {
		this.coder = coder;
	}

}
