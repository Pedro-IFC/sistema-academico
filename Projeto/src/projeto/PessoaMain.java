package projeto;
import java.time.LocalDate; 

public class PessoaMain {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Pedro", LocalDate.now());
		System.out.print(p);
	}

}
