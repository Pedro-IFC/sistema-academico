package projeto;

import java.util.ArrayList;

public class Fase {

	private Disciplina[] disciplina;
	private boolean status;
	private int cod;
	
	
	public boolean isStatus() {
		return status;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Disciplina[]getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina[] disciplina) {
		this.disciplina = disciplina;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fase [disciplina=");
		builder.append(disciplina);
		builder.append(", status=");
		builder.append(status);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
