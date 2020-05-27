package br.com.preparatorioconcurso.template.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.preparatorioconcurso.model.Cidade;

@Repository
@Transactional(propagation = Propagation.REQUIRED)
public class CidadeJDBC {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public String getCidade() {

		String sql = "select * from cidade";

		List<Cidade> cidades = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Cidade>(Cidade.class));

		return cidades.toString();
	}
}
