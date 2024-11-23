package hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import hibernate.entity.Employee;

public class Main {

	public static void main(String[] args) {
		Employee em = new Employee(1, "Riya", "Female", 57890);

//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfgg.xml").build();
//		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
//		SessionFactory sf = meta.buildSessionFactory();
		SessionFactory sf = new MetadataSources( new StandardServiceRegistryBuilder().configure("hibernate.cfgg.xml").build()).getMetadataBuilder().build().buildSessionFactory();
		
		Session session = sf.openSession();
		session.save(em);
		session.beginTransaction().commit();
		sf.close();
		System.out.println("Main.main()");

	}

}
