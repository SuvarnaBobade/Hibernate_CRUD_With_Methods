package com.Main_Class;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ProductEntity.Product;

public class InsertProductRec {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Product.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Product p = new Product();
		p.setBrand("parle");
		p.setColor("orange");
		p.setCompany_name("parle");
		p.setPrice(5);
		p.setProduct_name("parle biscuits");
		p.setWgt(50);
		ss.persist(p);
		tr.commit();
		ss.close();
		System.out.println("inserted sucessfully..........!");

	}
}
