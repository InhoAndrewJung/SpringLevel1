package jdbc2;
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
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
/*
 * jdbc2에서 변경된 지점...
 * 1. BeanPropertyRowMapper을 바로 사용하자
 * 2. JdbcTemplate를 필드로 추가하지 말고(has a relation), 
 */
public class MemberDaoImpl extends JdbcDaoSupport implements MemberDao{
	
	

	public void register(MemberVO vo) {
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO members VALUES(");
		sql.append("?,?,?,?)");
		
		Object[] param = {vo.getId(), vo.getPassword(), vo.getName(), vo.getAddress()};
		getJdbcTemplate().update(sql.toString(),param);
	}

	public List<MemberVO> getList() {
		String sql = "SELECT * FROM members";
		RowMapper<MemberVO> mapper = new BeanPropertyRowMapper<MemberVO>(MemberVO.class);
		
		return getJdbcTemplate().query(sql, mapper);
	}

	public MemberVO getSearch(String id) {
		String sql = "SELECT * FROM members WHERE id=?";
		Object[] param = {id};
		RowMapper<MemberVO> mapper = new BeanPropertyRowMapper<MemberVO>(MemberVO.class);
		return getJdbcTemplate().queryForObject(sql, mapper, param);
	}

}
