package domain;

public class Pessoa {
	
	protected int id;
	protected String nome;
	
	public Pessoa() {
		super();
	}

	public Pessoa (int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void consultarSituacao() {
		
		System.out.println();
		System.out.println("\t\tID: "+ id + "Nome: " + nome+ "");
		
	}
	
}
