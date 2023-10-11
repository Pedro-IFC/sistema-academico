package projeto;

import java.util.ArrayList;

public class Fase {

	private ArrayList<Disciplina> disciplina;
	private boolean status;
	private ArrayList<Disciplina> retorno;
	                       
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public ArrayList<Disciplina> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(ArrayList<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}

	public void addDisciplina(Disciplina disciplina) {
		this.getDisciplina().add(disciplina);
	}
	
	public ArrayList<Disciplina> listarPorStatus(boolean status) {
		retorno = null;
	    for (int i =0; i< this.disciplina.size(); i++) {
	      if(this.getDisciplina().get(i).isStatus()==status) {
	    	  retorno.add(this.getDisciplina().get(i));
	      }
	    }
	    return retorno;
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
