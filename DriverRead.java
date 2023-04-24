package ManyToMany.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ManyToMany.dto.Doctor;

public class DriverRead 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("yogesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
        Doctor doctor = entityManager.find(Doctor.class,3);
        System.out.println(doctor);      
		
	}
}
