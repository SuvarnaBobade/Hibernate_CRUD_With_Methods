package com.Main_Class;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.StudentEntity.Student;

public class UpdateStudentRec {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Student.class);
	SessionFactory sf = cfg.buildSessionFactory();
	Session ss= sf.openSession();
	Transaction tr= ss.beginTransaction();
	int roll_number =3;
	Student s =ss.get(Student.class, roll_number);
	s.setAddress("Nashik");
	s.setAdhar_no(2334434);
	s.setAge(22);
	s.setGender("female");
	s.setStud_name("Rohini");
	ss.merge(s);
	tr.commit();
	ss.close();
	System.out.println("Record updated sucessfully.........!");

}
}
