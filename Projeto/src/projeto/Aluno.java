package projeto;

import java.time.LocalDate;
import java.util.ArrayList;

public class Aluno extends Pessoa {
	private Curso[] cursos;
	public Aluno(String nome, LocalDate dataNascimento) {
		super(nome, dataNascimento);
	}
	public Curso[] getCursos() {
		return cursos;
	}
	public void setCursos(Curso[] cursos) {
		this.cursos = cursos;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [cursos=");
		builder.append(cursos);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
