package projeto;

import java.util.ArrayList;
import java.util.Arrays;

public class Curso {
	private String nome;
	private String status;
	private Fase[] fases;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Fase[] getFases() {
		return fases;
	}
	public void setFases(Fase[] fases) {
		this.fases = fases;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Curso [nome=");
		builder.append(nome);
		builder.append(", status=");
		builder.append(status);
		builder.append(", fases=");
		builder.append(Arrays.toString(fases));
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
