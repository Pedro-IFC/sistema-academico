package projeto;

import java.util.ArrayList;

public class Curso {
	private String nome;
	private String status;
	private ArrayList<Fase> fases;
	private ArrayList<Fase> retorno;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ArrayList<Fase> getFases() {
		return fases;
	}
	public void setFases(ArrayList<Fase> fases) {
		this.fases = fases;
	}


	public void addFase(Fase fase) {
		this.getFases().add(fase);
	}
	
	public ArrayList<Fase> listarPorStatus(boolean status) {
		retorno = null;
	    for (int i =0; i< this.fases.size(); i++) {
	      if(this.getFases().get(i).isStatus()==status) {
	    	  retorno.add(this.getFases().get(i));
	      }
	    }
	    return retorno;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Curso [nome=");
		builder.append(nome);
		builder.append(", status=");
		builder.append(status);
		builder.append(", fases=");
		builder.append(fases);
		builder.append(", retorno=");
		builder.append(retorno);
		builder.append("]");
		return builder.toString();
	}
	
}
