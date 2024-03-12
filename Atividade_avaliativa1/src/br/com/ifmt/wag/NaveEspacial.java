package br.com.ifmt.wag;

public abstract class NaveEspacial {
	    protected String nome;
	    protected double velocidadeMaxima;
	    protected int numeroTripulantes;
	    protected double combustivel;

	    public NaveEspacial(String nome, double velocidadeMaxima, int numeroTripulantes, double combustivel) {
	        this.nome = nome;
	        this.velocidadeMaxima = velocidadeMaxima;
	        this.numeroTripulantes = numeroTripulantes;
	        this.combustivel = combustivel;
	    }
		public String nome(String nome) {
			return this.nome = nome;
		}
		
		public double velocidadeMax(double velocidade) {
			return this.velocidadeMaxima = velocidade;
		}
		
		public int numerosPassageiros(int numeroTripulantes) {
			return this.numeroTripulantes =  numeroTripulantes;
		}

		public double combustivel(double combustivel) {
			return this.combustivel = combustivel;
		}
		

	    public void acelerar(double velocidade) {
	        if (velocidade <= velocidadeMaxima) {
	            System.out.println("Acelerando a nave " + nome + " para " + velocidade + " km/h.");
	        } else {
	            System.out.println("Velocidade máxima excedida. Acelerando a nave " + nome + " para " + velocidadeMaxima + " km/h.");
	        }
	    }

	    public void desacelerar(double velocidade) {
	        if (velocidade >= 0) {
	            System.out.println("Desacelerando a nave " + nome + " para " + velocidade + " km/h.");
	        } else {
	            System.out.println("Velocidade mínima atingida. A nave " + nome + " está parada.");
	        }
	    }

	    public void abastecer(double litros) {
	        combustivel += litros;
	        System.out.println("Abastecendo a nave " + nome + ". Combustível atual: " + combustivel + " litros.");
	    }
	
	    public void viajar(double distancia) {
	    	double consumoCombustivel =  distancia / 100;
	    	if(combustivel >= consumoCombustivel) {
	    		combustivel -= consumoCombustivel;
	    		 System.out.println("A nave " + nome + " viajou " + distancia + " km e consumiu " 
	    		+ consumoCombustivel + " litros de combustível. Combustível restante: " 
	    		+ combustivel + " litros.");
	    	}else {
	    		System.out.println("A nave não possui combustivel o suficiente para continuar a viajem");
	    	}
	    }
	    
	
		@Override
		public String toString() {
			return "NaveEspacial nome: " + nome + ", velocidadeMaxima: " + velocidadeMaxima + ", numeroTripulantes: "
					+ numeroTripulantes + ", combustivel: " + combustivel;
		}
		

}
