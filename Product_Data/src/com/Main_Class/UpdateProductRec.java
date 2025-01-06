package com.Main_Class;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ProductEntity.Product;

public class UpdateProductRec {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Product.class);
	
	SessionFactory sf = cfg.buildSessionFactory();
	Session ss= sf.openSession();
	Transaction tr = ss.beginTransaction();
	int id =2;
	Product p= ss.get(Product.class, id);
	p.setBrand("parle");
	p.setColor("brown");
	p.setCompany_name("parle");
	p.setPrice(10);
	p.setProduct_name("parle biscuits");
	p.setWgt(100);
	ss.merge(p);
	tr.commit();
	ss.close();
	System.out.println("Record updated sucessfully.........!");

}
}
