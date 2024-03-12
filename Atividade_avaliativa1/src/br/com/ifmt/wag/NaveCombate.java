package br.com.ifmt.wag;

public class NaveCombate extends NaveEspacial{
	private String armamento;
	public NaveCombate(String nome, double velocidadeMaxima, int numeroTripulantes, double combustivel, String armamentol) {
		super(nome, velocidadeMaxima, numeroTripulantes, combustivel);
		this.armamento = armamentol;
	}
	public String getArmamento() {
		return armamento;
	}
	public void setArmamento(String armamento) {
		this.armamento = armamento;
	}
	
	public void atacar() {	
		System.out.println("Atacando inimingo com " + armamento);
	}


}
