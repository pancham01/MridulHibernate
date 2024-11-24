package hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hibernate.config.HibernateConfiguration;
import hibernate.entity.Employee;

public class Main {

	public static void main(String[] args) {
		Employee em = new Employee(1,"Riya", "Female", 57890);
		SessionFactory sf = HibernateConfiguration.getSessionFactory();
		
		Session session = sf.openSession();
		session.save(em);
		session.beginTransaction().commit();
		sf.close();
		System.out.println("Main.main()");

	}

}
