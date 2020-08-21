package GC.Lab23Grades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;




    @Repository
	public class GradeDao {
		
		@Autowired
		private JdbcTemplate jdbc;

		public List<Grade>findAll(){
			String sql= "SELECT * FROM grade";
			return jdbc.query(sql, new BeanPropertyRowMapper<>(Grade.class));
		}
		
		public Grade findById(Long id) {
			Grade match= jdbc.queryForObject("SELECT * FROM grade WHERE id= ?",
					new BeanPropertyRowMapper<>(Grade.class), id);
			return match ;
		}
			
		
		
		public void create(Grade grade) {
			String sql= "INSERT INTO grade( id, name, type, score,total) VALUES (?,?,?,?,?)";
			jdbc.update(sql, grade.getId(), grade.getName(), grade.getType(),grade.getScore(), grade.getTotal());
		}
		
		public void update(Grade grade) {
			String sql="UPDATE grade SET id=?  name =?,type =?, score = ? total=?";
			jdbc.update(sql,grade.getId(), grade.getName(), grade.getType(),grade.getScore(), grade.getTotal());
					
		}
		public void delete(Long id) {
			String sql= " Delete From grade WHERE id =?";
					jdbc.update(sql,id);
		}
		
	}


