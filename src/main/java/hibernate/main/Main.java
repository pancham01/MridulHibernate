package hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernate.entity.Employee;

public class Main {

	public static void main(String[] args) {
		Employee akash = new Employee(4, "Priya", "Female", 57890);

//		Configuration cfg = new Configuration().configure("hibernate.cfgg.xml");
//		SessionFactory sf = cfg.buildSessionFactory();
//		Session session = sf.openSession();

		Session session = new Configuration().configure("hibernate.cfgg.xml").buildSessionFactory().openSession();
//		Transaction tx = session.beginTransaction();
		session.persist(akash);
		session.beginTransaction().commit();
		System.out.println("Main.main()");

	}

}
