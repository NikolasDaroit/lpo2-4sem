package Funcionarios;

public class Funcionario {
	private double salario;
	private String nome;
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Funcionario(double salario) {
		super();
		this.salario = salario;
		this.nome =  "Fulano";
	}
	
	public boolean bonifica(int val) {
		
		setSalario(getSalario()+val);
		return false;
	}
	public double calculaGanhoAnual() {
		double val;
		val = this.salario*12;
		return val;
	}
	
	void mostra() {
        System.out.println("Nome: " + this.nome + 
        		"\nSalario: "+ this.salario + 
        		"\nGanho Anual: " + this.calculaGanhoAnual());
        // imprimir aqui os outros atributos...
        // também pode imprimir this.calculaGanhoAnual()
   }
}
