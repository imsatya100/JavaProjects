package demo.struts;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;


public class PersonDAO {
	public static Integer savePerson(PersonBean pb){
		/*	Configuration config = new Configuration().configure("/hibernate.cfg.xml");
		
			SessionFactory factory = config.buildSessionFactory();
		*/
		
		ServiceRegistry registry = new StandardServiceRegistryBuilder().configure("/hibernate.cfg.xml").build();
		
		Metadata metaData = new MetadataSources(registry).getMetadataBuilder().build();
		
		//SessionFactory factory = metaData.getSessionFactoryBuilder().build();
		SessionFactory factory = metaData.buildSessionFactory();
		
		//Session session = factory.getCurrentSession();
		Session session = factory.openSession();
		
		Integer status = (Integer)session.save(pb);
		return status;

	}
}