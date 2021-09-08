package exercicio2;
/*
 * 	Crie uma classe avião e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto avião, defina as instancias deste
	objeto e apresente as informações deste objeto no console.
 */
public class Application {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao();
		
		aviao1.empresa = "GOL";
		aviao1.cor = "Laranja";
		aviao1.destino = "Bahia";
		aviao1.tanque=20;
		
		//Aviso que precisa abastecer!
		if(aviao1.tanque <50) {
			System.out.println("O avião da empresa "+aviao1.empresa+", com destino a "+aviao1.destino+" precisa abastecer..");
			System.out.println("Tem apenas "+aviao1.tanque+" litros de querosene");
		}

	}


}
