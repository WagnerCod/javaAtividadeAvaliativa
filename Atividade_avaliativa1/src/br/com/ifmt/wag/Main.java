package br.com.ifmt.wag;

public class Main {

	public static void main(String[] args) {
		Teclado leia = new Teclado();
		NaveCarga carga = new NaveCarga(null, 0, 0, 0, 0);
		NaveCombate combate = new NaveCombate(null, 0, 0, 0, null);
		NavePassageiro navpassageiro = new NavePassageiro(null, 0, 0, 0);

		while (true) {
			int tiponave = leia.lerInteiro("Qual será o tipo da sua nave? \n 1- Carga | 2-Passageiro | 3- Combate");
			switch (tiponave) {
			case 1:
				System.out.println("Carga");
				String naveNome = leia.lerString("Qual será o nome da sua nave de Carga ");
				double naveVelocidadeMax = leia.lerDouble("Qual será a velocidade MAXIMA??");
				String resultNome = carga.nome(naveNome);
				double resultVelocidadeMax = carga.velocidadeMax(naveVelocidadeMax);
				double naveCapacidadeCarga = leia.lerDouble("Qual a capacidade de carga da nave? ");
				carga.setCapacidadeCarga(naveCapacidadeCarga);
				
				int cargaopc = leia.lerInteiro("Gostaria de carregar a nave? 1-sim | 2- nao");
				if (cargaopc == 1) {
					double naveCarregar = leia.lerDouble("quantos toneladas quer carregar na nave? ");
					carga.carregar(naveCarregar);
				} else if (cargaopc == 2) {
					System.out.println("Gostaria de abastecer a nave? ");
					int cargaopc2 = leia.lerInteiro("1- sim | 2- nao");
					if(cargaopc2 ==1 ) {
						double carregar = leia.lerDouble("Irá abastecer quantos kg ");
						carga.carregar(carregar);						
					}
				}
				carga.toString();
				break;
			case 2:
				System.out.println("Passageiro");
				String naveNomepassageiro = leia.lerString("Qual sera o nome da sua nave de passageiro? ");
				navpassageiro.nome(naveNomepassageiro);
				int pessoasAtuais = leia.lerInteiro("Qual a quantidade de tribulantes atuais na nave? ");
				navpassageiro.numerosPassageiros(pessoasAtuais);
				navpassageiro.toString();				
				break;
			case 3:
				System.out.println("Combate");
				break;
			default:
				System.out.println("Não foi possivel acessar");
			}
		}
	}

}
