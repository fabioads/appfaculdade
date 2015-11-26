package br.com.appfaculdade.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Fábio Henrique Pires
 */

@Entity
@Table(name = "disciplina")
public class Disciplina {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "disc_codigo")
	private Long codigo;
	
	@Column(name = "disc_nome")
	private String nome;
	
	@Column(name = "disc_creditos")
	private Integer creditos;
	
	public Disciplina() {
		super();
	}
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCreditos() {
		return creditos;
	}

	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}
	
	
}
