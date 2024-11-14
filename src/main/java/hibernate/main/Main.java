package hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernate.entity.Employee;

public class Main {

	public static void main(String[] args) {
		Employee akash = new Employee(1, "Akash Kumar", "Male", 57890);

		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
//		Transaction tx = session.beginTransaction();
		session.persist(akash);
		session.beginTransaction().commit();
		System.out.println("Main.main()");

	}

}
