package ManyToMany.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import ManyToMany.dto.Doctor;

public class DriverRemove 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("yogesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Doctor doctor = entityManager.find(Doctor.class,3);
		entityTransaction.begin();
		System.out.println(doctor);
		entityManager.remove(doctor);
		entityTransaction.commit();       
	}
	
}
