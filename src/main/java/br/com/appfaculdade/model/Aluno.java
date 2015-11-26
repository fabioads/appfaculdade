package br.com.appfaculdade.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author Fábio Henrique Pires
 * 
 */

@Entity
@Table(name="aluno")
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="aluno_matricula")
	private Long matricula;
	
	@Column(name="aluno_nome")
	private String nome;
	
	@Column(name="aluno_telefone")
	private String telefone;
	
	@Column(name="aluno_email")
	private String email;
	
	@Column(name="aluno_cpf")
	private String cpf;

	
    @ManyToOne
    @JoinColumn(name = "turma_codigo", nullable = false)
	private Turma turma;
	
	public Aluno(){
		super();
	}
	
	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}