package com.Main_Class;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.BookEntity.*;

public class InsertBookRec {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Book.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Book b = new Book();

		b.setAuthor_name("ram");
		b.setBook_name("ramayan");
		b.setPrice(250);
		ss.persist(b);
		tr.commit();
		ss.close();

		System.out.println("Insert record successfully.............!");
	}
}
