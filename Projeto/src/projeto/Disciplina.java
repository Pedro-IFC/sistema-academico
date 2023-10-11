package projeto;

import java.util.ArrayList;
import java.util.Arrays;

public class Disciplina {
	private int cod;
	private ArrayList<Aluno> alunos;
	private Professor[] professores = new Professor[4];
	private String nome;
	private boolean status;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public Professor[] getProfessores() {
		return professores;
	}
	public void setProfessores(Professor[] professores) {
		this.professores = professores;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Disciplina [cod=");
		builder.append(cod);
		builder.append(", alunos=");
		builder.append(alunos);
		builder.append(", professores=");
		builder.append(Arrays.toString(professores));
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}
	
	
}
