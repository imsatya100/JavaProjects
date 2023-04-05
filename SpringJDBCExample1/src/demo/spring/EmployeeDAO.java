package demo.spring;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDAO {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public Boolean saveEmployee(Employee e){
		String query="INSERT INTO EMPLOYEE VALUES(?,?,?)";
		return  jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1, e.getId());
				ps.setString(2, e.getName());
				ps.setInt(3, e.getSal());
				return ps.execute();
			}
		});
	}
	public int updateEmployee(Employee e){
		String query="UPDATE EMPLOYEE SET SALARY="+e.getSal()+" WHERE ID="+e.getId();
		return jdbcTemplate.update(query);
	}
	public int deleteEmployee(Employee e){
		String query="DELETE FROM EMPLOYEE WHERE ID="+e.getId();
		return jdbcTemplate.update(query);
	}
	
	public List<Employee> getEmployees(){
		String query="SELECT ID,NAME,SALARY FROM EMPLOYEE";
		return jdbcTemplate.query(query, new ResultSetExtractor<List<Employee>>() {
			
			@Override
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Employee> empList = new ArrayList<Employee>();
				
				while(rs.next()){
					Employee e = new Employee();
					e.setId(rs.getInt(1));
					e.setName(rs.getString(2));
					e.setSal(rs.getInt(3));
					empList.add(e);
				}
				return empList;
			}
		});
	}
	
	
	public List<Employee> getEmployeeById(Employee e){
		String query="SELECT ID,NAME,SALARY FROM EMPLOYEE WHERE ID="+e.getId();
		return jdbcTemplate.query(query, new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNumber) throws SQLException {
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSal(rs.getInt(3));
				return e;
			}
		});	
	}
	
	
	
}
