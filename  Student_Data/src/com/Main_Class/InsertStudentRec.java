package com.Main_Class;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.StudentEntity.Student;

public class InsertStudentRec {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Student s = new Student();
		s.setAddress("Kolkata");
		s.setAdhar_no(2334434);
		s.setAge(22);
		s.setGender("male");
		s.setStud_name("ram");
		ss.persist(s);
		tr.commit();
		ss.close();
		System.out.println("Record inserted sucessfully.........!");
	}
}
