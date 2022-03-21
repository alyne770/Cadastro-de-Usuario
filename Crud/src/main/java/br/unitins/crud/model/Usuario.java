package br.unitins.crud.model;

import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;

import br.unitins.crud.model.Usuario;
import br.unitins.crud.model.Usuario;

public class Usuario implements Cloneable {
	private Integer id;
	private Pessoa pessoa;
	@NotNull(message = "O CPF não pode ser nulo.")
	
	private String cpf;
	private Sexo sexo;
	private LocalDate dataDeNasc;
	private String registroG;
	private String telefone;
	
	
	public Usuario getClone() {
		try {
			return (Usuario) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(id, other.id);
	}

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public LocalDate getDataDeNasc() {
		return dataDeNasc;
	}
	public void setDataDeNasc(LocalDate dataDeNasc) {
		this.dataDeNasc = dataDeNasc;
	}
	public String getRegistroG() {
		return registroG;
	}
	public void setRegistroG(String registroG) {
		this.registroG = registroG;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	


}
