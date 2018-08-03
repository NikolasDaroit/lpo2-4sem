
public class Exercicios {

	

	public void ex01(){
		//Imprima todos os números de 150 a 300.
		for (int i=150;i<=300;i++) {
			System.out.print(i+", ");
		}
	}
	public void ex02() {
		//Imprima a soma de 1 até 1000.
		int sum = 0;
		for (int i=1;i<=1000;i++) {
			sum+=i;
		}
		System.out.print(sum);
	}
	public void ex03() {
		//Imprima todos os múltiplos de 3, entre 1 e 100.
		for (int i=1;i<=100;i++) {
			if (i%3==0) {
				System.out.println(i);
			}
		}
	}
	public long fat(int n) {
		if (n==0) {
			return 1;
		}
		return n *  fat(n-1);
	}
	public void ex04(int range) {
	/*
	  	Imprima os fatoriais de 1 a 10. O fatorial de um número n é n * n-1 * n-2 … até n = 1. Lembre-se de utilizar os parênteses. A saída deve ser:
		O fatorial de 0 é 1
		fatorial de 1 é (0!) * 1 = 1
		fatorial de 2 é (1!) * 2 = 2
		fatorial de 3 é (2!) * 3 = 6
		fatorial de 4 é (3!) * 4 = 24
		    
		Faça um for que inicie uma variável n (número) como 1 e fatorial (resultado) como 1 e varia n de 1 até 10:
		for (int n=1, fatorial=1; n <= 10; n++) { ... }  
	 */
		for (int i=1;i<=range;i++) {
			System.out.println(fat(i));
		}
	}
	public void ex05() {
		/*
		 * Imprima os primeiros números da série de Fibonacci até passar de 100. 
		 * A série de Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc… 
		 * Para calculá-la, o primeiro e segundo elementos valem 1, daí por diante, 
		 * o n-ésimo elemento vale o (n-1)-ésimo elemento somando ao (n-2)-ésimo elemento (ex: 8 = 5 + 3).
		 */
		
	}
	
}
