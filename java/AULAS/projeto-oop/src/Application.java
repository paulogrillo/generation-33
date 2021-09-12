import java.util.Scanner;

public class Application {
	
	static DAL dal = new DAL();
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		 getApresentacao();
		erp();
	
	}
	
	
	//Fun��o apresenta��o
	public static void getApresentacao() {
		for (int x = 0; x < 4; ++x) {
			System.out.print("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
		}
		System.out.println("|||||||||||||||||||| Loja DevShoes - CodeStyle � vida! ||||||||||||||||||||");
		for (int x = 0; x < 4; ++x) {
			System.out.print("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
		}
	}
	
	//Fun��o erp
	public static void erp(){
		System.out.print("\n\t\t    Deseja fazer uma compra? S/N_");
		String flag = sc.nextLine();
		System.out.println("\n\n\n\n\n");
		while (flag.toLowerCase().equals("s")) {

			if (flag.toLowerCase().equals("s")) {
				dal.exibeProdutosDisponiveis();
				System.out.print("Digite o c�digo do produto: ");
				String id = sc.nextLine();
				System.out.println("\n\n\n\n\n");
				
				dal.previewProduto(id);
				System.out.print("\nDigite a quantidade necess�ria: ");
				int quantidade = Integer.parseInt(sc.nextLine());
				System.out.println("\n\n\n\n\n");
				
				dal.addProductCarrinho(id, quantidade);
				dal.exibeProdutosCarrinho();
				System.out.println("\nDeseja continuar a compra? S/N");
				flag = sc.nextLine();
				
				if(flag.equalsIgnoreCase("n")){
					System.out.println("Aqui entra forma de pagamento..");
				}
			}
		}
		if(flag.toLowerCase().equals("n")){
			System.out.println("Ok.. At� breve..");
		}else{
			System.out.println("Voc� digigou um valor inv�lido!");
			erp();
		}
	}
	

}
