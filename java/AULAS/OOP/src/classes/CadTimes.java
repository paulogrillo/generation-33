package classes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Times;

public class CadTimes {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String equipes[] = new String[4];
		int pontos[] = new int[4];
		
		List<String> listaTimes = new ArrayList<>();
		
		List<Times> listaTopemm = new ArrayList<>();
		
		int x;
		String auxNome;
		char op;
		
		equipes[0] = "SPFC";
		equipes[1] = "SANTOS";
		equipes[2] = "PALMEIRAS";
		equipes[3] = "CORINTHIANS";
		
		pontos[0]=3;
		pontos[1]=3;
		pontos[2]=3;
		pontos[3]=3;
		
		listaTimes.add("SPFC");  //0
		listaTimes.add("PALMEIRAS");//1
		
		listaTimes.add(1, "SANTOS");
		listaTimes.add("CORINTHIANS");
		
		listaTopemm.add(new Times("SPFC"));
		listaTopemm.add(new Times("PALMEIRAS"));
		listaTopemm.add(1, new Times("SANTOS"));
		
		listaTopemm.get(1).ganharPontos('g');
		
		for (Times equipe : listaTopemm) {
			System.out.println(equipe.getNome()+" pontos :"+equipe.getPontos());
		}
		
		System.out.println("Selecione o nome do time:");
		auxNome = leia.next().toUpperCase();
		x=0;
		for (Times equipe : listaTopemm) {
			if (equipe.getNome().equals(auxNome)) {
				break;
			}
			x++;
		}
		//x = listaTopemm.indexOf(auxNome);
		System.out.println(x);
		
		if (x == listaTopemm.size()) {
			System.out.println("N�o encontrado....adicionando na lista");
			listaTopemm.add(new Times(auxNome));
		}
		else {
			System.out.println("Este time j� existe!!!");
			System.out.println("Vc escolheu o "+listaTopemm.get(x).getNome()+" pontos atuais :"+listaTopemm.get(x).getPontos());
			//System.out.println("Removendo da lista....");
			System.out.println("Que mudar os pontos 1-Mudar ou 2-Excluir o time :");
			op = leia.next().charAt(0);
			if (op =='1') {
				System.out.println("Escreva os novos pontos : G/P/E :");
				op  = leia.next().toLowerCase().charAt(0);
				listaTopemm.get(x).ganharPontos(op);
			}
			else if (op=='2') {
				listaTopemm.remove(x);
			}
			
		}
		
		System.out.println("NOVA LISTA");
		for (Times equipe : listaTopemm) {
			System.out.println(equipe.getNome() + " " + equipe.getPontos());
		}
		

		
		
		
		

	}
}
