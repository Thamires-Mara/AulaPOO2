package br.com.poo2;

public class Cadeira {

	public double tamanho;
	public double peso;
	public String cor;
	private String marca;
	private String modelo;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	public void massagear ( ) {
		
		System.out.println("Massageando");
	}
	
	
	public Cadeira(double tamanho, double peso, String cor, String marca, String modelo) {
		super();
		this.tamanho = tamanho;
		this.peso = peso;
		this.cor = cor;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	@Override
	public String toString() {
		return "Cadeira [tamanho=" + tamanho + ", peso=" + peso + ", cor=" + cor + ", marca=" + marca + ", modelo="
				+ modelo + "]";
	}
	public static void main(String[] args) {
		

		
	}
}
