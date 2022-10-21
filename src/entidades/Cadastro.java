package entidades;

public class Cadastro {

	private String nome;
	private String email;
	private int quartos;
	
	public Cadastro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cadastro(String nome, String email, int quartos) {
		this.nome = nome;
		this.email = email;
		this.quartos = quartos;
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

	public int getQuartos() {
		return quartos;
	}

	public void setQuartos(int quartos) {
		this.quartos = quartos;
	}

	@Override
	public String toString() {
		return getQuartos() + ": " + getNome() + ", " + getEmail();
	}
	
}
	
