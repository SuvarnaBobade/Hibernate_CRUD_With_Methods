package com.Main_Class;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.CarEntity.Car;

public class GetOneCarRec {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Car.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		int idcar_id = 1;
		Car c1 = ss.get(Car.class, idcar_id);
		System.out.println("Record is......");
		System.out.println(c1);

	}

}
