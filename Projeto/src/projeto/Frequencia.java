package projeto;

import java.time.LocalDate;
import java.time.LocalTime;

public class Frequencia {
	private LocalDate data; 
	private Aluno aluno;
	private Professor professor;
	private Disciplina disciplina;
	private LocalTime cargaHoraria;
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
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Frequencia [data=");
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
	
	public Frequencia(LocalDate data, Aluno aluno, Professor professor, Disciplina disciplina, LocalTime cargaHoraria) {
		super();
		this.data = data;
		this.aluno = aluno;
		this.professor = professor;
		this.disciplina = disciplina;
		this.cargaHoraria = cargaHoraria;
	}
	
	
	
	
}
