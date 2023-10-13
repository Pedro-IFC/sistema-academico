package projeto;

import java.time.LocalDate;

public class Professor extends Pessoa {
	public Professor(String nome, LocalDate dataNascimento) {
		super(nome, dataNascimento);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Professor [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
