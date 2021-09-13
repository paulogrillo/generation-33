package app;
import java.util.Scanner;
import entities.ContaCorrente;
import entities.ContaEmpresa;
import entities.ContaEspecial;
import entities.ContaEstudantil;
import entities.ContaPoupanca;

public class Executable {
	//Scanner
	static Scanner mySc = new Scanner(System.in);
	//Inst�ncias
	static ContaPoupanca cp1 = new ContaPoupanca("222.222.222-72",1,5);
	static ContaCorrente cc1 = new ContaCorrente("222.222.222-72",1);
	static ContaEspecial cesp1 = new ContaEspecial("222.222.222-72",1,5);
	static ContaEmpresa cemp1 = new ContaEmpresa("222.222.222-72",1);
	static ContaEstudantil cestu1 = new ContaEstudantil("222.222.222-72",1,5);
	//Slogan
	static String slogan="| ---- Global system ----- |";
	//Logo
	static String name="G6BANK";
	//Variaveis
	static char escolheTipoConta;
	static int day;
	static double valorMovimento=0.00;
	static String tipoTransacao;
	static String continuar;
	
	public static void main(String[] args) {
		cabecalho(); //Fun��o imprimir cabe�alho
		listaTipoConta(); //Fun��o listar tipo de contas
		leCodigoConta(); //Fun��o ler o c�digo da conta

			for(int x=1; x<=10; ++x){
				
				//CONTA 1 POUPAN�A
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
					
				}//CONTA CORRENTE
				else if (escolheTipoConta == '2'){
					cabecalho();
					System.out.printf("MOVIMENTO "+x+"\n");
					System.out.println("CONTA CORRENTE");
					System.out.println("SALDO ATUAL: R$"+cc1.getSaldo());
					tipoTransacao();
					if("d".equalsIgnoreCase(tipoTransacao)){
						leValorMovimento();
						cc1.debito(valorMovimento);
						resgate();
						continuar();
						
						if("n".equalsIgnoreCase(continuar)){
							resgate();
							System.out.println("Tal�o");
							
							break;
						}
					}else if("c".equalsIgnoreCase(tipoTransacao)){
						leValorMovimento();
						cc1.credito(valorMovimento);
				
						continuar();

						if("n".equalsIgnoreCase(continuar)){
							cc1.cheque();
							
						}
					}else {
						System.out.println("Valor inv�lido!");
					}
					cc1.cheque();
					
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
	
	
	//FUN��O RESGATAR BONIFICA��O ANIVERS�RIO
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
	
	//FUN��O CONTINUAR S/N
	public static void continuar(){
		System.out.println("Continuar S/N: _");
		continuar = mySc.next();
	}
	//FUN��O DE LEITURA TIPO DE TRANSA��O
	public static void tipoTransacao() {
		System.out.println("MOVIMENTO - D-debito ou C-Cr�dito: _");
		tipoTransacao = mySc.next();
	}
	//FUN��O DE LEITURA VALOR DA MOTIMENTA��O
	public static void leValorMovimento() {
		System.out.println("Valor movimento: R$ _");
		valorMovimento = mySc.nextDouble();
	}
	//FUN��O LISTAR TIPO DE CONTAS
	public static void listaTipoConta(){	
		System.out.println("TIPOS DE CONTAS:");
		System.out.println("1 - CONTA POUPAN�A");
		System.out.println("2 - CONTA CORRENTE");
		System.out.println("3 - CONTA ESPECIAL");
		System.out.println("4 - CONTA EMPRESA");
		System.out.println("5 - CONTA ESTUDANTIL");
		System.out.println("6 - SAIR\n");
	}
	//FUN��O DE LEITURA C�DIGO DA CONTA
	public static void leCodigoConta(){
		System.out.println("DIGITE O CODIGO DA CONTA : ");
		escolheTipoConta = mySc.next().charAt(0);
	}
	//FUN��O IMPRIMIR CABE�ALHO
	public static void cabecalho(){
		System.out.println(""+slogan+"");
		System.out.println("| ------- "+name+" -------- |\n");
		System.out.println("");
	}
	
	

}
