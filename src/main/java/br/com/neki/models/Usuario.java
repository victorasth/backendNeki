package br.com.neki.models;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "usuario", schema = "teste_residencia")
public class Usuario {

	private static final long serialVersionUID = 6116673232179737989L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;

	@NotNull
	@Column(name = "login")
	@Size(max = 12)
	private String usuario;

	@NotNull
	@Column(name = "password")
	@Size(max = 100)
	private String senha;

	@Column(name = "last_login_date")
	private LocalDate dataLogin;

	@OneToMany(mappedBy = "usuario")
	private List<HabilidadeUsuario> habilidades;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public LocalDate getDataLogin() {
		return dataLogin;
	}

	public void setDataLogin(LocalDate dataLogin) {
		this.dataLogin = dataLogin;
	}

	public List<HabilidadeUsuario> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<HabilidadeUsuario> habilidades) {
		this.habilidades = habilidades;
	}


}
