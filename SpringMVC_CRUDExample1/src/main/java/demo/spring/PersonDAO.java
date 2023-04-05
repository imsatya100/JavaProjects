package demo.spring;

import java.util.List;


import org.springframework.jdbc.core.JdbcTemplate;

public class PersonDAO {
	private JdbcTemplate jdbcTemplate=null;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int addPerson(Person p){
		String query="INSERT INTO PERSON VALUES(?,?,?,?,?)";
		int k=jdbcTemplate.update(query, p.getPid(),p.getName(),p.getAge(),p.getGender(),p.getMailid());
		System.out.println("Person Details Added :"+p);
		return k;
	}//addPerson()
	
	public Person getPersonById(Person p){
		String query="SELECT PID,NAME,AGE,GENDER,MAILID FROM PERSON WHERE PID=?";
		p = jdbcTemplate.queryForObject(query, new PersonMapper(), p.getPid());
		
		
		/*List<Person> li= jdbcTemplate.query(query, new PersonMapper(), p.getPid());
		p = li.get(0);
		*/
		
		return p;
	}//getPersonById()
	
	public List<Person> getAllPersonDetails(){
		String query="SELECT PID,NAME,AGE,GENDER,MAILID FROM PERSON";
		List<Person> li= jdbcTemplate.query(query, new PersonMapper());
		return li;
	}//getAllPersonDetails();
	
	public int deletePerson(Person p){
		String query="DELETE FROM PERSON WHERE PID=?";
		int k = jdbcTemplate.update(query, p.getPid());
		return k;
	}//deletePerson();
	
	
}
