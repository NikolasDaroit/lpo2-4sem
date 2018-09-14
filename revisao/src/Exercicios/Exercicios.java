package Exercicios;

public class Exercicios {

	

	public void ex01(){
		//Imprima todos os nÃºmeros de 150 a 300.
		for (int i=150;i<=300;i++) {
			System.out.print(i+", ");
		}
	}
	public void ex02() {
		//Imprima a soma de 1 ateÌ� 1000.
		int sum = 0;
		for (int i=1;i<=1000;i++) {
			sum+=i;
		}
		System.out.print(sum);
	}
	public void ex03() {
		//Imprima todos os mÃºltiplos de 3, entre 1 e 100.
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
	  	Imprima os fatoriais de 1 a 10. O fatorial de um nÃºmero n eÌ� n * n-1 * n-2 â€¦ ateÌ� n = 1. Lembre-se de utilizar os parÃªnteses. A saÃ­da deve ser:
		O fatorial de 0 eÌ� 1
		fatorial de 1 eÌ� (0!) * 1 = 1
		fatorial de 2 eÌ� (1!) * 2 = 2
		fatorial de 3 eÌ� (2!) * 3 = 6
		fatorial de 4 eÌ� (3!) * 4 = 24
		    
		FaÃ§a um for que inicie uma variÃ¡vel n (nÃºmero) como 1 e fatorial (resultado) como 1 e varia n de 1 ateÌ� 10:
		for (int n=1, fatorial=1; n <= 10; n++) { ... }  
		Aumente a quantidade de números que terão os fatoriais impressos, até 20, 30, 40. Em um determinado momento, 
		além desse cálculo demorar, vai começar a mostrar respostas completamente erradas. Porque? Mude de int para long, 
		e você poderá ver alguma mudança.
	 */
		for (int i=1;i<=range;i++) {
			System.out.println(fat(i));
		}
	}
	public int fibo(int n) {
		return (n < 2) ? n: fibo(n-1) + fibo(n-2);
	}
	public void ex06() {
		/*
		 * Imprima os primeiros nÃºmeros da sÃ©rie de Fibonacci ateÌ� passar de 100. 
		 * A sÃ©rie de Fibonacci eÌ� a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etcâ€¦ 
		 * Para calculÃ¡-la, o primeiro e segundo elementos valem 1, daiÌ� por diante, 
		 * o n-Ã©simo elemento vale o (n-1)-Ã©simo elemento somando ao (n-2)-Ã©simo elemento (ex: 8 = 5 + 3).
		 * 
		 * EX 7 Faça o exercício da série de Fibonacci usando apenas duas variáveis
		 */
		int i, aux;
		i=aux=0;
		while (aux <= 100) {
			aux = fibo(i);
			System.out.println(aux);
			i++;
		}
	}
	public int ex08(int x) {
		/*
		 * Escreva um programa que, dada uma variável x (com valor 180, por exemplo), temos y de acordo com a seguinte regra:
			a.	se x é par, y=x/2  
			b.	se x  é impar, y=3*x+1  
			c.	imprime y  
			    
			O programa deve então jogar o valor de y em x e continuar até que y tenha o valor final de 1. 
			Por exemplo, para x = 13, a saída será:
			
			40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
		 */
		if (x==1) {
			return x;
		}
		int y;
		if (x%2==0) {
			y=x/2;
		}else {
			y = 3*x+1;
		}
		System.out.println(y);
		return ex08(y); 
	}
	public void ex09() {
		/*
		 * Imprima a seguinte tabela, usando fors encadeados:
			1
			2 4
			3 6 9
			4 8 12 16
			n n*2 n*3 .... n*n
		 */
		
	}
	public void ex10(String texto, int n) {
		while(n>0) {
			System.out.print(texto);
			n--;
		}
	}
	public void ex11(String texto, int n) {
		if (texto.length() < 3 ) return;
		while(n>0) {
			System.out.print(texto.substring(0, 3));
			n--;
		}
	}
	
}