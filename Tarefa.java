package exercicio;

import java.util.Scanner;

public class Tarefa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		int num;
	    int antecessor;
	    int sucessor;
	   	
	    System.out.println("Digite um n�mero inteiro");
	    int number = teclado.nextInt ();
	    
	    int antecessor1 = number -1;
	    int sucessor1 = number +1;
	      
	    System.out.println("O antecessor � " + antecessor1);
	    System.out.println("O sucessor � " + sucessor1);
	    
	    teclado.close();
	  
	    
	   

	    
	    
	}
}
