package demo.struts;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class MySession {
	public static Integer save(Person p){
		ServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metaData = new MetadataSources(registry).getMetadataBuilder().build();
		SessionFactory factory = metaData.getSessionFactoryBuilder().build();
		Session session = factory.getCurrentSession();
		Transaction tx = session.getTransaction();
		tx.begin();
		
		Integer status = (Integer) session.save(p);
		if(status>0){
			tx.commit();
		}
		else {
			tx.rollback();
		}
		return status;
	}
}
