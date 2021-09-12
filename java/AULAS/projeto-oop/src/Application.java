import java.util.Scanner;

public class Application {
	
	static DAL dal = new DAL();
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		erp();
	
	}
	public static void erp(){
		System.out.println("Deseja fazer uma compra? S/N");
		String flag = sc.nextLine();
		
		while (flag.toLowerCase().equals("s")) {

			if (flag.toLowerCase().equals("s")) {
				dal.exibeProdutosDisponiveis();
				String id = sc.nextLine();
				dal.previewProduto(id);
				System.out.println("\nDigite a quantidade necessária\n");
				int quantidade = Integer.parseInt(sc.nextLine());

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
			System.out.println("Ok.. Até breve..");
		}else{
			System.out.println("Você digigou um valor inválido!");
			erp();
		}
	}
	

}
