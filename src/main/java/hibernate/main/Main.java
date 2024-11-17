package hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import hibernate.entity.Employee;

public class Main {

	public static void main(String[] args) {
		Employee akash = new Employee( "Riya", "Female", 57890);

//		Configuration cfg = new Configuration().configure("hibernate.cfgg.xml");
//		SessionFactory sf = cfg.buildSessionFactory();
//		Session session = sf.openSession();

//		Session session = new Configuration().configure("hibernate.cfgg.xml").buildSessionFactory().openSession();
//		Transaction tx = session.beginTransaction();
		
		
		
//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfgg.xml").build();
//		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
//		SessionFactory sf = meta.buildSessionFactory();
		SessionFactory sf = new MetadataSources( new StandardServiceRegistryBuilder().configure("hibernate.cfgg.xml").build()).getMetadataBuilder().build().buildSessionFactory();
		
		Session session = sf.openSession();
		session.save(akash);
		session.beginTransaction().commit();
		sf.close();
		System.out.println("Main.main()");

	}

}
