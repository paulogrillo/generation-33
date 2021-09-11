package app;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<String>();
		
		lista.forEach(String item => {
			System.out.println("Items: ");
		});
		
		lista.stream().filter(item => item.equals("")).
	

	}

}
