package demo.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class PersonDAO {
	private HibernateTemplate template;
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	
	public void updatePerson(Person p){
		 template.save(p);
	}
	
	public void delete(Person p){
		template.delete(p);
	}
	public List<?> getAllPerson(){
		List<?> persons = new ArrayList<Person>();
		
		persons = template.loadAll(Person.class);
		
		return persons;
	}
	public Person getPersonById(Person p){
		p = (Person)template.get(Person.class, p.getPid());
		return p;
	}
}
