package HibernatePractice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App {
	
	public static void main(String args[]) {
		
		Alien alien1 = new Alien(1,"a1","g");
		
		System.out.println(alien1.aid);
		
		System.out.println(Thread.currentThread().getContextClassLoader().getResource("hibernate.cfg.xml"));

		
		
		Configuration con = new Configuration()
                .configure("hibernate.cfg.xml") // loads hibernate.cfg.xml
                .addAnnotatedClass(Alien.class); // your entity class

		ServiceRegistry reg = new StandardServiceRegistryBuilder()
                .applySettings(con.getProperties())
                .build();

		SessionFactory sf = con.buildSessionFactory(reg);

		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		session.save(alien1); // save your object

		tx.commit(); // commit the transaction
		
	}

}
