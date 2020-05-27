package br.com.preparatorioconcurso.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.preparatorioconcurso.template.jdbc.CidadeJDBC;

@RestController
@RequestMapping("/api/cidade")
public class CidadeControllerJDBC {

	@Autowired
	private CidadeJDBC templateJDBC;

	@GetMapping("/getCidade")
	String getCidade() {
		return templateJDBC.getCidade();
	}
}
