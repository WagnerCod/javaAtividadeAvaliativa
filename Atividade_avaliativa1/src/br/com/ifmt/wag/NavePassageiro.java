package br.com.ifmt.wag;

public class NavePassageiro extends NaveEspacial{
	private int passageirosAtual;
	public NavePassageiro(String nome, double velocidadeMaxima, int numeroTripulantes, double combustivel) {
		super(nome, velocidadeMaxima, numeroTripulantes, combustivel);
		this.passageirosAtual = 0;
		
	}

	@Override
	public int numerosPassageiros(int numeroTripulantes) {
		return this.numeroTripulantes = numeroTripulantes;
	}
	
	public void embarcar(int passageiros) {
		if(passageirosAtual + passageiros <= numeroTripulantes) {
			passageirosAtual += passageiros;
			System.out.println("Numeros de passageiros atuais: " + numeroTripulantes + ", Embarcando: " + passageiros );
		}else {
			System.out.println("Nenhum passageiro vai embarcar");
		}
	}
	@Override
	public String toString() {
		return "NavePassageiro: numeros de Passageiros: " + numeroTripulantes + ", passageirosAtual: " + passageirosAtual;
	}
	
	

}
