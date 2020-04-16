package com.capg.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.entities.Customer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu1");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		
		Customer customer = new Customer(1,"Vishal","Pune","9850810100", 37);
		
		tx.begin();
		em.persist(customer);
		tx.commit();
	}

}
