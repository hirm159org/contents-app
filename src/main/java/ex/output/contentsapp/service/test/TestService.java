package ex.output.contentsapp.service.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import ex.output.contentsapp.controller.test.dto.TestDto;

@Service
public class TestService {

	@Autowired
	private NamedParameterJdbcTemplate jdbc;

	public List<TestDto> initTest() {
		String searchSql = sql;

		RowMapper<TestDto> rowMapper = new BeanPropertyRowMapper<TestDto>(TestDto.class);

		return jdbc.query(searchSql, rowMapper);
	}

	private static final String sql = """
		SELECT
		    id
		    , name
		    , delete_flg
		FROM
		    mst_test;
	""";

}
