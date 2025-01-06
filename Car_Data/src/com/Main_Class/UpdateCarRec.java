package com.Main_Class;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.CarEntity.Car;

public class UpdateCarRec {
public static void main(String[] args) {
	Configuration  cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Car.class);
	
	SessionFactory sf = cfg.buildSessionFactory();
	Session ss= sf.openSession();
	Transaction tr = ss.beginTransaction();
	int car_id=1;
	Car c = ss.get(Car.class, car_id);
	c.setColor("black");
	c.setNumber("123223");
	c.setYear(2023);
	c.setModel("Honda ");
	ss.merge(c);
	tr.commit();
	ss.close();
	System.out.println("Record updated sucessfully.........!");

}
}
