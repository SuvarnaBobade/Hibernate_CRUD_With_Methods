package com.Main_Class;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.CustomerEntity.Customer;

public class DeleteCustomerRec {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Customer.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		int id = 2;
		Customer c1 = ss.get(Customer.class, id);
		ss.remove(c1);
		tr.commit();
		ss.close();
		System.out.println("Record deleted sucessfully............!");

	}

}
