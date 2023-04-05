package demo.spring;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PersonMapper implements RowMapper<Person>{

	public Person mapRow(ResultSet rs, int rowNumber) throws SQLException {
		Person person = new Person();
		person.setPid(rs.getString(1));
		person.setName(rs.getString(2));
		person.setAge(rs.getInt(3));
		person.setGender(rs.getString(4));
		person.setMailid(rs.getString(5));
		return person;
	}

}
