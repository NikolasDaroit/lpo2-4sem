package Carro;

public class Motor {
	private int potencia;
	private String tipo;
	
	public Motor(int potencia, String tipo) {
		super();
		this.setPotencia(potencia);
		this.setTipo(tipo);
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
