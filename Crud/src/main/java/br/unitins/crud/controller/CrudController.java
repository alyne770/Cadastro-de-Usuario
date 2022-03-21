package br.unitins.crud.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import br.unitins.crud.model.Usuario;
import br.unitins.crud.model.Pessoa;
import br.unitins.crud.model.Sexo;
import br.unitins.crud.application.Util;

@Named
@ApplicationScoped
public class CrudController implements Serializable {
	private static final long serialVersionUID = 1L;
	private Usuario usuario;
	private List<Usuario> listaUsuario;
	private int cont = 1;
	
	
	private boolean validarCampos() {
		if (getUsuario().getCpf().isBlank()) {
			Util.addMessageError("O cpf deve ser informado.");
			return false;
		}
		if (getUsuario().getCpf().trim().length() < 2) {
			Util.addMessageError("O cpf deve ter pelo menos 2 caracteres.");
			return false;
		}
		return true;
	}
	
	public void incluir() {
		if (!validarCampos())
			return;
		
		getUsuario().setId(cont++);
		getListaUsuario().add(getUsuario());
		usuario = null;
		
		Util.addMessageInfo("Inclusão realizada com sucesso.");
	}
	
	public void alterar() {
		if (!validarCampos())
			return;
		
		int index = listaUsuario.indexOf(getUsuario());
		listaUsuario.set(index, getUsuario());
		limpar();
		Util.addMessageInfo("Alteração realizada com sucesso.");
	}
	
	public void excluir(Usuario usuario) {
		listaUsuario.remove(usuario);
		Util.addMessageInfo("Exclusão realizada com sucesso.");
	}
	
	
	public void editar(Usuario usuario) {
		setUsuario(usuario.getClone());
	}
	
	public void limpar() {
		usuario = null;
	}
	
	
	public Sexo[] getListaSexo() {
		return Sexo.values();
	}
	
	public Usuario getUsuario() {
		if (usuario == null) {
			usuario = new Usuario();
			usuario.setPessoa(new Pessoa());
		}
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<Usuario> getListaUsuario() {
		if (listaUsuario == null)
			listaUsuario = new ArrayList<Usuario>();
		return listaUsuario;
	}
	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}
	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		this.cont = cont;
	}
	
	
	
}
