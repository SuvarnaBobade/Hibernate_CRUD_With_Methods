package com.Main_Class;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.CarEntity.Car;

public class InsertCarRec {
public static void main(String[] args) {

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Car.class);
	SessionFactory sf =cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();
	Car c = new Car();
	c.setColor("white");
	c.setNumber("1223");
	c.setYear(2024);
	c.setModel("Honda ");
	ss.persist(c);
	tr.commit();
	ss.close();

	System.out.println("Insert record Sucessfullyu........!");
}
}
