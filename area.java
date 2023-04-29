import java.util.Scanner;

// Pesquisar como se faz a conta
// Declarar variáveis (Base,altura e resultado)
// Colocar o valor do comprimento do triângulo
// armazenar o comprimento
// Colocar o valor da base
// armazenar o valor da base
// Dividir por dois
// Printar o resultado

class RenomearClasse {
  
	public static void main(String args[]){  
   
    		Scanner teclado = new Scanner(System.in);
 
			double altura;
			double base;
			double resultado;
    
		System.out.printf("Qual a altura do triangulo? \n\n");
		 altura = teclado.nextDouble();
		 
		System.out.printf("Qual a base do Triangulo? \n\n");
		 base = teclado.nextDouble();
		 
		resultado = (altura * base) / 2;
		System.out.printf ("A base do triangulo e: \n\n" + resultado);

    		System.exit(0);
		
	}

}
