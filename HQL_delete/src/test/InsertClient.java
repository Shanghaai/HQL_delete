package test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Employee;

public class InsertClient {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure("resources/Hibernate.cfg.xml");
	SessionFactory sf = cfg.buildSessionFactory();
		Session s =	sf.openSession();
		Transaction t =s.beginTransaction();		

		
		Employee e = new Employee(555, "Robin", "Chennai");
		s.save(e);
		t.commit();
		s.close();
		sf.close();
		System.out.println("data inserted ");
}
}
