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
	//Instâncias
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
		cabecalho(); //Função imprimir cabeçalho
		listaTipoConta(); //Função listar tipo de contas
		leCodigoConta(); //Função ler o código da conta

			for(int x=1; x<=10; ++x){
				
				//CONTA 1 POUPANÇA
				if(escolheTipoConta == '1'){
					cabecalho();
					System.out.printf("MOVIMENTO "+x+"\n");
					System.out.println("CONTA POUPANÇA");
					System.out.println("SALDO ATUAL: R$"+cp1.getSaldo());
					tipoTransacao();
					if("d".equalsIgnoreCase(tipoTransacao)){
						leValorMovimento();
						cp1.debito(valorMovimento);
						resgate();
						continuar();
						
						if("n".equalsIgnoreCase(continuar)){
							System.out.println("Até breve!");
							break;
						}
					}else if("c".equalsIgnoreCase(tipoTransacao)){
						leValorMovimento();
						cp1.credito(valorMovimento);
						resgate();
						continuar();

						if("n".equalsIgnoreCase(continuar)){
							
							System.out.println("Até breve!");
							break;
						}
					}else {
						System.out.println("Valor inválido!");
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
							System.out.println("Talão");
							
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
						System.out.println("Valor inválido!");
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
							System.out.println("Até breve!");
							break;
						}
						
					}else if("c".equalsIgnoreCase(tipoTransacao)){
						leValorMovimento();
						continuar();
						if("n".equalsIgnoreCase(continuar)){
							System.out.println("Até breve!");
							break;
						}
					}else {
						System.out.println("Valor inválido!");
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
							System.out.println("Até breve!");
							break;
						}
						
					}else if("c".equalsIgnoreCase(tipoTransacao)){
						leValorMovimento();
						continuar();
						if("n".equalsIgnoreCase(continuar)){
							System.out.println("Até breve!");
							break;
						}
					}else {
						System.out.println("Valor inválido!");
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
							System.out.println("Até breve!");
							break;
						}
						
					}else if("c".equalsIgnoreCase(tipoTransacao)){
						leValorMovimento();
						continuar();
						if("n".equalsIgnoreCase(continuar)){
							System.out.println("Até breve!");
							break;
						}
					}else {
						System.out.println("Valor inválido!");
					}	
					
				}else {
					System.out.println("Até breve!");
					break;
					
				}				
				
			}
			
		
		}
	
	
	//FUNÇÃO RESGATAR BONIFICAÇÃO ANIVERSÁRIO
	public static void resgate(){
		System.out.println("Digite a data de hoje: ");
		day = mySc.nextInt();
		cp1.correcao(day);
		if(day == cp1.getDiaAniversario()){
			System.out.println("Parabéns pelo seu aniversário! \n");
			System.out.println("Você receberá uma bonificaçõ! \n");
		}else {
			System.out.println("Sem bonificação no momento..");
		}
	}
	
	//FUNÇÃO CONTINUAR S/N
	public static void continuar(){
		System.out.println("Continuar S/N: _");
		continuar = mySc.next();
	}
	//FUNÇÃO DE LEITURA TIPO DE TRANSAÇÃO
	public static void tipoTransacao() {
		System.out.println("MOVIMENTO - D-debito ou C-Crédito: _");
		tipoTransacao = mySc.next();
	}
	//FUNÇÃO DE LEITURA VALOR DA MOTIMENTAÇÃO
	public static void leValorMovimento() {
		System.out.println("Valor movimento: R$ _");
		valorMovimento = mySc.nextDouble();
	}
	//FUNÇÃO LISTAR TIPO DE CONTAS
	public static void listaTipoConta(){	
		System.out.println("TIPOS DE CONTAS:");
		System.out.println("1 - CONTA POUPANÇA");
		System.out.println("2 - CONTA CORRENTE");
		System.out.println("3 - CONTA ESPECIAL");
		System.out.println("4 - CONTA EMPRESA");
		System.out.println("5 - CONTA ESTUDANTIL");
		System.out.println("6 - SAIR\n");
	}
	//FUNÇÃO DE LEITURA CÓDIGO DA CONTA
	public static void leCodigoConta(){
		System.out.println("DIGITE O CODIGO DA CONTA : ");
		escolheTipoConta = mySc.next().charAt(0);
	}
	//FUNÇÃO IMPRIMIR CABEÇALHO
	public static void cabecalho(){
		System.out.println(""+slogan+"");
		System.out.println("| ------- "+name+" -------- |\n");
		System.out.println("");
	}
	
	

}
