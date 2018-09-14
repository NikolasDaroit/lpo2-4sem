package Funcionarios;

public class FuncionarioTeste {
	   
	    
	   public static void testaFuncionario(){
	     Funcionario meuFuncionario = new Funcionario(1000);
	     meuFuncionario.bonifica(-100);
//	     System.out.println(meuFuncionario.getSalario());
	     meuFuncionario.mostra();
	     //Atribua valores ao funcionário, passando o salario = 1000
	     //Execute o método bonifica passando o valor 100
	     //Imprima o salario atual
	   }
	   public static void main(String[] args) {
	        testaFuncionario();
	   }
	 }