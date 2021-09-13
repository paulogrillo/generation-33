package applications;

import classes.Pessoa;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa fulano = new Pessoa();
		Pessoa cicrano = new Pessoa();
		
		fulano.nome = "Epaminondas";
		fulano.anoNascimento = 2000;
		cicrano.nome = "João";
		cicrano.anoNascimento = 1960;
		
		
		System.out.println(fulano.nome.toUpperCase());
		System.out.println(fulano.anoNascimento);
		fulano.mostraIdade();
		
		System.out.println(cicrano.nome.toUpperCase());
		System.out.println(cicrano.anoNascimento);
		fulano.mostraIdade();
	}

}
