package br.com.codenation.desafioexe; //"Folder"

//importing Libraries
import java.util.List;
import java.util.ArrayList;


public class DesafioApplication {
	
//Declaring Variables
	public static List<Integer> fibonacci() {
		
		List<Integer> fibonacci = new ArrayList<>();
		
		int termoFB1 = 0 , termoFB2 = 1, verificador = 1;
		fibonacci.add(termoFB1);
		fibonacci.add(termoFB2);
		fibonacci.add(verificador);
		
//Checking and calculating the Fibonacci series	
		while (verificador < 350) {
			termoFB1 = termoFB2;
			termoFB2 = verificador;
			verificador = termoFB1+termoFB2;
			fibonacci.add(verificador);
		}
		return fibonacci; //Returning Fibonacci List
	}
//If the number received by parameter is among the numbers in the Fibonnaci sequence above ("Fibonnaci"), return true, if not, false.
	public static Boolean isFibonacci(Integer a) {
		
		return fibonacci().contains(a);
	}

}