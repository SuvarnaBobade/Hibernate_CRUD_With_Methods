package com.Main_Class;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.BookEntity.Book;

public class GetOneBookRec {
public static void main(String[] args) {
	Configuration cfg= new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Book.class);
	
	SessionFactory sf= cfg.buildSessionFactory();
	Session ss= sf.openSession();
	Transaction tr = ss.beginTransaction();
	int id= 3;
	Book b1= ss.get(Book.class, id);
	System.out.println("Record Is......");
	System.out.println(b1);
}
}
