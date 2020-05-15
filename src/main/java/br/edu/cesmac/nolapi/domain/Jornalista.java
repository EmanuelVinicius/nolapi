package br.edu.cesmac.nolapi.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.validation.constraints.Email;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Jornalista {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idJornalista;

	@NotEmpty(message = "Obrigatório o uso do nome Jornalista")
	private String nome;

	@NotNull(message = "Obrigatório informar um e-mail")
	@Email(message = "O e-mail deve ser valido")
	private String email;

	@NotEmpty(message = "Obrigatório informar a biografia do Jornalista")
	private String biografia;

	@JsonIgnoreProperties("jornalista")
	@OneToMany(mappedBy = "jornalista")
	private List<Noticia> noticias;

	public Long getIdJornalista() {
		return idJornalista;
	}

	public void setIdJornalista(Long idJornalista) {
		this.idJornalista = idJornalista;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

}
