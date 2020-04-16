package com.capg.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.capg.entities.Customer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu1");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		TypedQuery<Customer> q = em.createQuery("FROM Customer c", Customer.class);
		List<Customer> list =	q.getResultList();
		
		System.out.println(list);
		
		
//		Customer c = em.find(Customer.class, 1);
//		
//		if(c!=null) {
//			tx.begin();
//			em.remove(c);
//			tx.commit();
//		}
//		
		
//		Customer c = em.find(Customer.class, 1);
//		System.out.println(c);
//		
//		tx.begin();
//		c.setCity("Mumbai");
//		tx.commit();
		
//		Customer customer = new Customer(1,"Vishal","Pune","9850810100", 37);
//		
//		tx.begin();
//		em.persist(customer);
//		tx.commit();
	}

}
