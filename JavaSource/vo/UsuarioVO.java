package vo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name = "usuario")
public class UsuarioVO {
	private int id;
	
	private String nome, senha;

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	

}
