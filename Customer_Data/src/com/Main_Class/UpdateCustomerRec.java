package com.Main_Class;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.CustomerEntity.Customer;

public class UpdateCustomerRec {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Customer.class);
	
	SessionFactory sf = cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();
	 int id =1;
	 Customer c =ss.get(Customer.class, id);
	 c.setAddress("nashik");
		c.setAdhar_no(2234345);
		c.setCust_email("p@gmail.com");
		c.setCust_name("priya");
		c.setMobile_no(34435);
		c.setPan_no("asdfp2344");
		ss.merge(c);
		tr.commit();
		ss.close();
		System.out.println("Record updated sucessfully.........!");

}
}
