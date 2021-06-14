package domain;

public class Aluno extends Pessoa{
	
	private String grauEscolar;
	private String anoEscolar;
	
	public Aluno() {
		super();
	}

	public Aluno(int id, String nome, String grauEscolar, String anoEscolar) {
		
		super(id, nome);
		
		this.grauEscolar = grauEscolar;
		this.anoEscolar = anoEscolar;
	}

	public String getGrauEscolar() {
		return grauEscolar;
	}

	public void setGrauEscolar(String grauEscolar) {
		this.grauEscolar = grauEscolar;
	}

	public String getAnoEscolar() {
		return anoEscolar;
	}

	public void setAnoEscolar(String anoEscolar) {
		this.anoEscolar = anoEscolar;
	}
	
	@Override
	public void consultarSituacao() {
		
		System.out.println();
		System.out.println("\t\tID: "+ id + " Aluno: " + nome + " Ensino: " + grauEscolar + " Ano: " + anoEscolar);
		
	}
	
	
}
