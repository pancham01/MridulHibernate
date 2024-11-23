package hibernate.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

public class HibernateConfiguration {

	public static SessionFactory getSessionFactory() {
		Properties ps = new Properties();
		ps.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
		ps.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/riya");
		ps.put(Environment.USER, "root");
		ps.put(Environment.PASS, "root");
		ps.put(Environment.HBM2DDL_AUTO, "create");
		ps.put(Environment.SHOW_SQL, "true");
		ps.put(Environment.FORMAT_SQL, "true");

//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().applySettings(ps).build();
//		MetadataSources meta = new MetadataSources(ssr);
//		MetadataSources meta = new MetadataSources(new StandardServiceRegistryBuilder().applySettings(ps).build()).addAnnotatedClassName("hibernate.entity.Employee");
//		meta.addAnnotatedClassName("hibernate.entity.Employee");
//		return meta.buildMetadata().buildSessionFactory();
		return new MetadataSources(new StandardServiceRegistryBuilder().applySettings(ps).build()).addAnnotatedClassName("hibernate.entity.Employee").buildMetadata().buildSessionFactory();
	}
}
