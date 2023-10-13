package projeto;

import java.time.LocalDate;
import java.time.LocalTime;

public class Avaliacao {
	private int peso;
	private double nota;
	private LocalDate data; 
	private Aluno aluno;
	private Professor professor;
	private Disciplina disciplina;
	private LocalTime cargaHoraria;
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public LocalTime getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(LocalTime cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public Avaliacao(int peso, double nota, LocalDate data, Aluno aluno, Professor professor, Disciplina disciplina,
			LocalTime cargaHoraria) {
		super();
		this.peso = peso;
		this.nota = nota;
		this.data = data;
		this.aluno = aluno;
		this.professor = professor;
		this.disciplina = disciplina;
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Avaliacao [peso=");
		builder.append(peso);
		builder.append(", nota=");
		builder.append(nota);
		builder.append(", data=");
		builder.append(data);
		builder.append(", aluno=");
		builder.append(aluno);
		builder.append(", professor=");
		builder.append(professor);
		builder.append(", disciplina=");
		builder.append(disciplina);
		builder.append(", cargaHoraria=");
		builder.append(cargaHoraria);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
