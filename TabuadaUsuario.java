//Fazer o import necessário para captar o dado do usuário.
import java.util.Scanner;


public class TabuadaUsuario {
	public static void main(String[] args) {
		//Queremos exibir uma tabuada escolhida pelo usuário.
		
		
		//Criando uma variável comum 
		int numero;
		
		//Criando uma instância de um objeto scanner.
		Scanner entrada = new Scanner (System.in); 
		
		
		//Capturando um valor do console digitado pelo usuário. 
		System.out.println("Digite um número para ver sua tabuada");
		numero = entrada.nextInt();
		
		
		//Texto cabeçalho e corpo para a tabuada;
		System.out.println("Exibindo a tabuada do "+ numero);
		System.out.println(" ");
		
		//For para cálculo e exibição da tabuada;
		for(int x = 1; x <= 10; x++) {
			int resultado;
			resultado = x * numero;
			
			System.out.println( x + "*" + numero + "=" + resultado);
		}
		
		
	
	}

}
