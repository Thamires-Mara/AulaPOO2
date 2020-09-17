package br.com.poo2;

public class cachorro extends Animal {

	public String raca;

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public String toString() {
		return "cachorro [raca=" + raca + "]";
	}

	
	
	
	
}
