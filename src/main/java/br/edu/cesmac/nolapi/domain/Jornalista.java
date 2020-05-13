package br.edu.cesmac.nolapi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
public class Jornalista {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idJornalista;
	@NotEmpty(message = "Obrigatório o uso do nome Jornalista")
	private String nome;
	@Email(message = "O e-mail deve ser valido	")
	@NotEmpty(message = "Obrigatório usar um email válido")
	private String email;
	@NotBlank
	private String biografia;
	@OneToOne
	private Noticia noticia;

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

	public Noticia getNoticia() {
		return noticia;
	}

	public void setNoticia(Noticia noticia) {
		this.noticia = noticia;
	}

}
