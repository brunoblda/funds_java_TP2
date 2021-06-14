package domain;

public class Professor extends Pessoa{

	private String materia;
	
	
	public Professor() {
		super();
	}

	public Professor(int id, String nome, String materia) {
		super(id, nome);
		this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}


	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public void consultarSituacao() {
		
		System.out.println();
		System.out.println("\t\tID: "+ id + " Professor: " + nome + " Leciona a matéria: " + materia );
		
	}
	
}
