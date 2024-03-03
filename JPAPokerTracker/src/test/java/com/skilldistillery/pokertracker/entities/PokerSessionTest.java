package com.skilldistillery.codingtracker.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.skilldistillery.codingtracker.entities.CodingSession;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

class CodingSessionTest {
	

	private static EntityManagerFactory emf;
	private EntityManager em;
	private CodingSession session;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPACodingTracker");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		session = em.find(CodingSession.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		session = null;
		em.close();
	}

	@Test
	void test_Actor_entity_mapping() {
		assertNotNull(session);
		assertEquals("Chris", session.getCoder());

	}
	@Test
	void test_Actor_to_Films() {
		assertNotNull(session);
		
	}

}
