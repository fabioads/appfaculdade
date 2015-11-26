package br.com.appfaculdade.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 
 * @author Fábio Henrique Pires
 *
 */

@Entity
@Table(name="turma")
public class Turma {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="turma_codigo")
	private Long codigo;
	
	@Column(name="turma_nome")
	private String nome;
	
	public Turma(){
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

}
