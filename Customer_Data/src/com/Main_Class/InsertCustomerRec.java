package com.Main_Class;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.CustomerEntity.Customer;

public class InsertCustomerRec {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Customer.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Customer c = new Customer();
		c.setAddress("pune");
		c.setAdhar_no(2234345);
		c.setCust_email("s@gmail.com");
		c.setCust_name("raj");
		c.setMobile_no(34435);
		c.setPan_no("asdfp2344");
		ss.persist(c);
		tr.commit();
		ss.close();
		System.out.println("appln is started");

	}
}
