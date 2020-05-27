package br.com.preparatorioconcurso.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "Cidade")
@EntityListeners(AuditingEntityListener.class)
public class Cidade {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "COD_CIDADE", length = 19)
	private Long codCidade;

	@Column(name = "NOME_CIDADE")
	private String nomeCidade;
	
	@Column(name = "POPULACAO", length = 10)
	private Long populacao;

	public Cidade() {
		super();
	}

	public Long getCodCidade() {
		return codCidade;
	}

	public void setCodCidade(Long codCidade) {
		this.codCidade = codCidade;
	}

	public Long getPopulacao() {
		return populacao;
	}

	public void setPopulacao(Long populacao) {
		this.populacao = populacao;
	}

	@Override
	public String toString() {
		return "Cidade [codCidade=" + codCidade + ", nomeCidade=" + nomeCidade + ", populacao=" + populacao + "]";
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}
	
}
