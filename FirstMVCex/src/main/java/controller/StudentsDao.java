package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class StudentsDao {

	private JdbcTemplate jdbcTemplate;
	
	class StudentsRowMapper implements RowMapper<Students>{

		public Students mapRow(ResultSet rs, int rowNum) throws SQLException {
			Students student = new Students();
			student.setId(rs.getInt("id"));
			student.setName(rs.getString("name"));
			student.setAge(rs.getInt("age"));
			return student;
		}
		
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Students> getStudents(){
		return jdbcTemplate.query("select * from students", new StudentsRowMapper());
	}
	
	public Students findById(int id){
		return jdbcTemplate.queryForObject("Select * from students where id=?",new Object[] {id}, new StudentsRowMapper());
	}
	
	public int updateStudent(Students student) {
		return jdbcTemplate.update("update students set name=?,age=? where id=?",new Object[] {student.getName(),
				student.getAge(),student.getId()});
	}
}
