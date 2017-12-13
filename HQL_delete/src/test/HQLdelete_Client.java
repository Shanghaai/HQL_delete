package test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Employee;

public class HQLdelete_Client {
public static void main(String[] args) 
{
	Configuration cfg = new Configuration();
	cfg.configure("resources/Hibernate.cfg.xml");
	SessionFactory sf = cfg.buildSessionFactory();
		Session s =	sf.openSession();
		Transaction t =s.beginTransaction();		

		
		//String hql = "update Employee set id =1000 where id = 1";
		//String hql = "update Employee set id =68,name = 'pakajkumar' where id = 555";
		String hql = "delete Employee where id = 333";
		
		Query q =s.createQuery(hql);
		int i = q.executeUpdate();
		
		t.commit();
		s.close();
		sf.close();
		System.out.println("rows affected :"+i);
		System.out.println("delete success");
}
}
