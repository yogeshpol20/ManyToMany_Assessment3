package ManyToMany.controller;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import ManyToMany.dto.Doctor;
import ManyToMany.dto.Patient;

public class DriverSave 
{
	public static void main(String[] args) 
	{
		Doctor d1 = new Doctor();
		d1.setId(1);
		d1.setName("Dr.Rohan");
		d1.setType("Orthopedic surgeon");
		
		Doctor d2 = new Doctor();
		d2.setId(2);
		d2.setName("Dr.Shanaya");
		d2.setType("Dentist");
		
		Doctor d3 = new Doctor();
		d3.setId(3);
		d3.setName("Dr.Sharad");
		d3.setType("Neurologist");
		
		Patient p1 = new Patient();
		p1.setId(1);
		p1.setName("Satish");
		p1.setGender('m');
		p1.setDisease("Brain Tumor");
		
		Patient p2 = new Patient();
		p2.setId(2);
		p2.setName("Nagesh");
		p2.setGender('m');
		p2.setDisease("Collar bone fracture");
		
		Patient p3 = new Patient();
		p3.setId(3);
		p3.setName("priya");
		p3.setGender('f');
		p3.setDisease("Cavity in tooth");
		
		Patient p4 = new Patient();
		p4.setId(4);
		p4.setName("Raju");
		p4.setGender('m');
		p4.setDisease("Right leg fractured");
		
		List<Patient> patientofRohan = new ArrayList<Patient>();
		patientofRohan.add(p2);
		patientofRohan.add(p4);

		List<Patient> patientofShanaya = new ArrayList<Patient>();
		patientofShanaya.add(p3);
		
		List<Patient> patientofSharad = new ArrayList<Patient>();
		patientofSharad.add(p1);
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("yogesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(d1);
		entityManager.persist(d2);
		entityManager.persist(d3);
		entityManager.persist(p1);
		entityManager.persist(p2);
		entityManager.persist(p3);
		entityManager.persist(p4);
		entityTransaction.commit(); 
	}
}
