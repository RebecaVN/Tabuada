//Fazer o import necess�rio para captar o dado do usu�rio.
import java.util.Scanner;


public class TabuadaUsuario {
	public static void main(String[] args) {
		//Queremos exibir uma tabuada escolhida pelo usu�rio.
		
		
		//Criando uma vari�vel comum 
		int numero;
		
		//Criando uma inst�ncia de um objeto scanner.
		Scanner entrada = new Scanner (System.in); 
		
		
		//Capturando um valor do console digitado pelo usu�rio. 
		System.out.println("Digite um n�mero para ver sua tabuada");
		numero = entrada.nextInt();
		
		
		//Texto cabe�alho e corpo para a tabuada;
		System.out.println("Exibindo a tabuada do "+ numero);
		System.out.println(" ");
		
		//For para c�lculo e exibi��o da tabuada;
		for(int x = 1; x <= 10; x++) {
			int resultado;
			resultado = x * numero;
			
			System.out.println( x + "*" + numero + "=" + resultado);
		}
		
		
	
	}

}
