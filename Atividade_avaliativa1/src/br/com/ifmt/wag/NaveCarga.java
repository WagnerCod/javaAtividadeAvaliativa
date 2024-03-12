package br.com.ifmt.wag;

public class NaveCarga  extends NaveEspacial{
	private double capacidadeCarga;
	private double cargaAtual;
	
	public NaveCarga(String nome, double velocidadeMaxima, int numeroTripulantes, double combustivel, double capacidadeCarga) {
		super(nome, velocidadeMaxima, numeroTripulantes, combustivel);
		this.capacidadeCarga = capacidadeCarga;
		this.cargaAtual = 0.0;
	}

	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}
	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}
	
	public void carregar(double carga) {
		if(cargaAtual + carga <= capacidadeCarga) {
			cargaAtual += carga;
            System.out.println("Carregando " + carga + " toneladas de carga na nave. Carga atual: " + cargaAtual + " toneladas.");
        } else {
            System.out.println("Capacidade de carga excedida. Não é possível carregar mais carga.");
        }
    }
	
	
	public String verCarga() {
		return "NaveCarga capacidadeCarga: " + capacidadeCarga + ", cargaAtual: " + cargaAtual;
	}

	
}
