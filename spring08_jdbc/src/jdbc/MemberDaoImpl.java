package jdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
/*
 * Spring JDBC에서 제공하는 라이브러리를 이용해서 비지니스 로직을 작성
 * SpringJdcbFramework에서 가장 핵심이 되는 클래스는 JdbcTemplate
 * ::
 *1) DataSource를 setter()로 가진다.
 *2) 쿼리문을 수행하는 메소드
 *   int update("") :: insert, update, delete 를 수행
 *   queryForList() :: select * from member
 *   queryForOne() :: select * from member where id=?
 *   
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class MemberDaoImpl implements MemberDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	/*public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}*/

	public void register(MemberVO vo) {
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO members VALUES(");
		sql.append("?,?,?,?)");
		
		Object[] param = {vo.getId(), vo.getPassword(), vo.getName(), vo.getAddress()};
		jdbcTemplate.update(sql.toString(),param);
	}

	public List<MemberVO> getList() {
		String sql = "SELECT * FROM members";
		List<MemberVO> list = jdbcTemplate.query(sql, new RowMapper() {
 
			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
				System.out.println("arg1 :: "+arg1);
				
				MemberVO vo = new MemberVO(rs.getString("id"), rs.getString("password"), rs.getString("name"), rs.getString("address"));
				return vo;
			}
		});
		return list;
	}

	public MemberVO getSearch(String id) {
		String sql = "SELECT * FROM members WHERE id=?";
		Object[] param = {id};
		
		MemberVO v = (MemberVO)jdbcTemplate.queryForObject(sql, param, new RowMapper() {

			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
				MemberVO vo = new MemberVO(rs.getString("id"), 
						rs.getString("password"), 
						rs.getString("name"), 
						rs.getString("address"));
				return vo;
			}
		});
		return v;
	}

}
