package app;

import java.util.Scanner;

import entities.ContaCorrente;
import entities.ContaEmpresa;
import entities.ContaEspecial;
import entities.ContaEstudantil;
import entities.ContaPoupanca;

public class Executable {
	static Scanner mySc = new Scanner(System.in);
	static ContaPoupanca cp1 = new ContaPoupanca("222.222.222-72",1,5);
	static String slogan="| ---- Global system ----- |";
	static String name="G6BANK";
	
	static char escolheTipoConta;
	static int day;
	static double valorMovimento=0.00;
	static String tipoTransacao;
	static String continuar;
	
	public static void main(String[] args) {
		
		
		
		//Inst�ncias
				
		ContaCorrente cc1 = new ContaCorrente("222.222.222-72",1);
		ContaEspecial cesp1 = new ContaEspecial("222.222.222-72",1,5);
		ContaEmpresa cemp1 = new ContaEmpresa("222.222.222-72",1);
		ContaEstudantil cestu1 = new ContaEstudantil("222.222.222-72",1,5);
		
		//Fun��o Cabe�alho
		cabecalho();
		listaTipoConta();
		leCodigoConta();

			for(int x=1; x<=10; ++x){		
				
				//CONTA 1
				if(escolheTipoConta == '1'){
					
					cabecalho();
					System.out.printf("MOVIMENTO "+x+"\n");
					System.out.println("CONTA POUPAN�A");
					System.out.println("SALDO ATUAL: R$"+cp1.getSaldo());
					tipoTransacao();
					if("d".equalsIgnoreCase(tipoTransacao)){
						leValorMovimento();
						
						cp1.debito(valorMovimento);
						resgate();
						continuar();
						if("n".equalsIgnoreCase(continuar)){
							System.out.println("At� breve!");
							break;
						}
						
					}else if("c".equalsIgnoreCase(tipoTransacao)){
						leValorMovimento();
						cp1.credito(valorMovimento);
						resgate();
						continuar();
						
						
						if("n".equalsIgnoreCase(continuar)){
							System.out.println("At� breve!");
							break;
						}
					}else {
						System.out.println("Valor inv�lido!");
					}
				
				}//CONTA 2
				else if (escolheTipoConta == '2'){
					cabecalho();
					System.out.println("CONTA CORRENTE");
					
					System.out.println("SALDO ATUAL: R$"+cc1.getSaldo());
					tipoTransacao();
					if("d".equalsIgnoreCase(tipoTransacao)){
						leValorMovimento();
						continuar();
						if("n".equalsIgnoreCase(continuar)){
							System.out.println("At� breve!");
							break;
						}
						
					}else if("c".equalsIgnoreCase(tipoTransacao)){
						leValorMovimento();
						continuar();
						if("n".equalsIgnoreCase(continuar)){
							System.out.println("At� breve!");
							break;
						}
					}else {
						System.out.println("Valor inv�lido!");
					}
				}//CONTA 3
				else if (escolheTipoConta == '3'){
					cabecalho();
					System.out.println("CONTA ESPECIAL");
					System.out.println("SALDO ATUAL: R$"+cesp1.getSaldo());
					tipoTransacao();
					if("d".equalsIgnoreCase(tipoTransacao)){
						leValorMovimento();
						continuar();
						if("n".equalsIgnoreCase(continuar)){
							System.out.println("At� breve!");
							break;
						}
						
					}else if("c".equalsIgnoreCase(tipoTransacao)){
						leValorMovimento();
						continuar();
						if("n".equalsIgnoreCase(continuar)){
							System.out.println("At� breve!");
							break;
						}
					}else {
						System.out.println("Valor inv�lido!");
					}	
					
				}//CONTA 4
				else if (escolheTipoConta == '4'){
					cabecalho();
					System.out.println("CONTA EMPRESA");

					System.out.println("SALDO ATUAL: R$"+cemp1.getSaldo());
					tipoTransacao();
					if("d".equalsIgnoreCase(tipoTransacao)){
						leValorMovimento();
						continuar();
						if("n".equalsIgnoreCase(continuar)){
							System.out.println("At� breve!");
							break;
						}
						
					}else if("c".equalsIgnoreCase(tipoTransacao)){
						leValorMovimento();
						continuar();
						if("n".equalsIgnoreCase(continuar)){
							System.out.println("At� breve!");
							break;
						}
					}else {
						System.out.println("Valor inv�lido!");
					}	
					
				}//CONTA 5
				else if (escolheTipoConta == '5'){
					cabecalho();
					System.out.println("CONTA ESTUDANTIL");

					System.out.println("SALDO ATUAL: R$"+cestu1.getSaldo());
					tipoTransacao();
					if("d".equalsIgnoreCase(tipoTransacao)){
						leValorMovimento();
						continuar();
						if("n".equalsIgnoreCase(continuar)){
							System.out.println("At� breve!");
							break;
						}
						
					}else if("c".equalsIgnoreCase(tipoTransacao)){
						leValorMovimento();
						continuar();
						if("n".equalsIgnoreCase(continuar)){
							System.out.println("At� breve!");
							break;
						}
					}else {
						System.out.println("Valor inv�lido!");
					}	
					
				}else {
					System.out.println("At� breve!");
					break;
					
				}				
				
			}
			
		
		}
	
	public static void resgate(){
		System.out.println("Digite a data de hoje: ");
		day = mySc.nextInt();
		cp1.correcao(day);
		if(day == cp1.getDiaAniversario()){
			System.out.println("Parab�ns pelo seu anivers�rio! \n");
			System.out.println("Voc� receber� uma bonifica��! \n");
		}else {
			System.out.println("Sem bonifica��o no momento..");
		}
	}
	
	public static void continuar(){
		
		System.out.println("Continuar S/N: _");
		continuar = mySc.next();
	}
	public static void tipoTransacao() {
		
		System.out.println("MOVIMENTO - D-debito ou C-Cr�dito: _");
		tipoTransacao = mySc.next();
	}
	
	public static void leValorMovimento() {
		System.out.println("Valor movimento: R$ _");
		valorMovimento = mySc.nextDouble();
	}
	
	public static void listaTipoConta(){
		System.out.println("TIPOS DE CONTAS:");
		System.out.println("1 - CONTA POUPAN�A");
		System.out.println("2 - CONTA CORRENTE");
		System.out.println("3 - CONTA ESPECIAL");
		System.out.println("4 - CONTA EMPRESA");
		System.out.println("5 - CONTA ESTUDANTIL");
		System.out.println("6 - SAIR\n");
	}
	
	public static void leCodigoConta(){
		System.out.println("DIGITE O CODIGO DA CONTA : ");
		escolheTipoConta = mySc.next().charAt(0);
	}
	
	public static void cabecalho(){
		System.out.println(""+slogan+"");
		System.out.println("| ------- "+name+" -------- |\n");
		System.out.println("");
	}
	
	

}
