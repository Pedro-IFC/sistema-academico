package projeto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Daniel", LocalDate.now());
		System.out.println(p);
		
		Professor pr = new Professor("Curvello", LocalDate.now());
		System.out.println(pr);

		Professor[] professores = new Professor[4];
		professores[0]=pr;
		
		Aluno a = new Aluno("Pedro", LocalDate.now());
		System.out.println(a);

		Aluno[] listaAluno = new Aluno[1];
		listaAluno[0]=a;
		
		Curso curso = new Curso();
		
		Fase fase = new Fase();
		fase.setCod(1);
		fase.setStatus(true);
		
		Disciplina d = new Disciplina();
		d.setCod(2);
		d.setAlunos(listaAluno);
		d.setProfessores(professores);
		d.setStatus(true);
		d.setNome("POO");
		System.out.println(d);
		
		Disciplina[] listaD = new Disciplina[1];
		listaD[0] = d;
 		fase.setDisciplina(listaD);

		System.out.println(fase);
		Fase[] listaFases = new Fase[1];
		listaFases[0] = fase;
		curso.setFases(listaFases);
		curso.setNome("BCC");
		System.out.println(curso);

		Curso[] listaC= new Curso[1];
		listaC[0] = curso;
		a.setCursos(listaC);
		System.out.println(a);
		
		
		Frequencia fr = new Frequencia(LocalDate.now(), a, pr, d, LocalTime.now());
		System.out.println(fr);
		

		Avaliacao av = new Avaliacao(3, 8.0, LocalDate.now(), a, pr, d, LocalTime.now());
		System.out.println(av);
		
	}
}
