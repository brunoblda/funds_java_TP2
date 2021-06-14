package application;

import java.util.Scanner;

import domain.Professor;
import domain.Pessoa;
import domain.Aluno;


public class Main{

	
	private static int tamanhoVetor = 100;
	private static Pessoa[] pessoas = new Pessoa[tamanhoVetor];
	private static String opcao;
	private static int index = 0;

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("\t\tAplicativo de Controle Academico");
		
		do {
			cabecalho();
			opcao = sc.next();
		
			System.out.println();
			
			switch (opcao) {
			case "1":
				
				adicionarAluno();
				break;
				
			case "2":
				
				adicionarProfessor();
				break;
				
			case "3":
				
				System.out.print("\tConsultar situação de um docente/discente (Id): ");	
				int idPessoa = sc.nextInt();
				
				if(index > 0) {
					
				pessoas[idPessoa].consultarSituacao();	
					
				System.out.println();
				
				}else {
					System.out.println("\n\tNão há nenhum aluno ou professor cadastrado.");
				}
				break;
				
			case "4": 
				
				System.out.println("\n\tPrograma Finalizado!!!");
				break;
				
			default:
				
				System.out.println("\n\tOpção inválida!!! ");
				break;
			}
			
		}while(!opcao.equals("4"));
	}
	
	public static void cabecalho() {
		
		System.out.println("");
		System.out.println("\t\t[1] Cadastrar aluno:");
		System.out.println("\t\t[2] Cadastrar professor:");
		System.out.println("\t\t[3] Consultar situação de um docente/discente:");
		System.out.println("\t\t[4] Sair.");
		System.out.println("");
		System.out.print("\tDigite uma das opções acima: ");
	}
	
	public static void adicionarAluno() {
	
		if(index < tamanhoVetor) {
		
		System.out.print("\tDigite o nome do Aluno: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.println();
		
		System.out.print("\tDigite ensino fundamental ou médio: ");
		String grauEscolar = sc.nextLine();
		
		System.out.println();
		
		System.out.print("\tDigite o Ano Escolar(1, 2, 3 , 4...): ");
		String anoEscolar = sc.nextLine();
		
		System.out.println();
		
		Aluno aluno = new Aluno(index, nome, grauEscolar, anoEscolar); 
		
		pessoas[index] = aluno;
		
		System.out.println("\tO aluno "+ aluno.getNome()+ " foi registrado no ID: " + aluno.getId());
		
		index++;
		
		}else {
			
			System.out.println("\tNão é possível adicionar mais alunos ou professores, o sistema alcançou o limite de " + tamanhoVetor + " alunos e professores armazenados.");
		}
	}
	
	public static void adicionarProfessor() {
	
		if(index < tamanhoVetor) {
		
		System.out.print("\tDigite o nome do Professor: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.println();
		
		System.out.print("\tDigite a matéria lecionada: ");
		String materia = sc.nextLine();
		
		System.out.println();
		
		Professor professor = new Professor(index, nome, materia); 
		
		pessoas[index] = professor;
		
		System.out.println("\tO professor  "+ nome + " foi registrado no ID: " + index);
		
		index++;
		
		}else {
			
			System.out.println("\tNão é possível adicionar mais alunos ou professores, o sistema alcançou o limite de " + tamanhoVetor + " alunos e professores armazenados.");
		}
	}
	
	public static String centerString (int width, String s) {
	    return String.format("%-" + width  + "s", String.format("%" + (s.length() + (width - s.length()) / 2) + "s", s));
	}
	
}