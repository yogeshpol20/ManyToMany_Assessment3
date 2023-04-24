package ManyToMany.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import ManyToMany.dto.Doctor;

public class DriverUpdate 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("yogesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Doctor doctor = entityManager.find(Doctor.class,3);
		doctor.setName("Dr.Omkar");
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(doctor);
		entityTransaction.commit();
	}
}
	
