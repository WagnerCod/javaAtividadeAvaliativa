package br.com.ifmt.wag;

public class Main {

	public static void main(String[] args) {
		Teclado leia = new Teclado();
		NaveCarga navCarga = new NaveCarga(null, 0, 0, 0, 0);
		NaveCombate navCombate = new NaveCombate(null, 0, 0, 0, null);
		NavePassageiro navPassageiro = new NavePassageiro(null, 0, 0, 0);

		while (true) {
			int tiponave = leia.lerInteiro("\n \n Qual será o tipo da sua nave? \n 1- Carga | 2-Passageiro | 3- Combate");
			switch (tiponave) {
			case 1:
				System.out.println("Carga");
				String naveNome = leia.lerString("Qual será o nome da sua nave de Carga ");
				String resultNome = navCarga.nome(naveNome);
				
				double naveCapacidadeCarga = leia.lerDouble("Qual a capacidade de carga da nave? ");
				navCarga.setCapacidadeCarga(naveCapacidadeCarga);

				int opcCarga = leia.lerInteiro("Gostaria de carregar a nave? 1-sim | 2- nao");
				if (opcCarga == 1) {
					double carregar = leia.lerDouble("quantos toneladas quer carregar na nave? ");
					navCarga.carregar(carregar);
					navCarga.verCarga();
					}
					System.out.println("Gostaria de abastecer a nave? ");
					int opcAbastecer = leia.lerInteiro("1- sim | 2- nao");
					if (opcAbastecer == 1) {
						double abastecer = leia.lerDouble("Irá abastecer quantos litros ");
						navCarga.abastecer(abastecer);
					}	
				
				double velocidadeMax = leia.lerDouble("qual a velocidade max da nave?");
				navCarga.velocidadeMax(velocidadeMax);
					
				System.out.println("Comece sua jornadaaa acelera essa nave de carga");

			        int opcDesacelerar;
			        do {
			            double acelera = leia.lerDouble("Acelere digite a velocidade para começar... (cuidado com o limite da velocidade maxima! )");
			            navCarga.acelerar(acelera);

			            opcDesacelerar = leia.lerInteiro("Quer acelerar mais? Digite 1 para sim ou qualquer outro número para não:");
			        } while (opcDesacelerar == 1);

				System.out.println("Agora desacelere");
				double desacelerar = leia.lerDouble("desacelera essa nave");
				navCarga.desacelerar(desacelerar);

				System.out.println("Comece  a viajar pelas galaxias agora! ");
				int opcViajar = leia.lerInteiro("1- sim | 2- não");
				if(opcViajar == 1) {
					double distancia = leia.lerDouble("Quantos km irá viajar até o seu destino? ");
					navCarga.viajar(distancia);
				}
				navCarga.toString();
				break;
				
			case 2:
				System.out.println("Passageiro");
				String naveNomepassageiro = leia.lerString("Qual sera o nome da sua nave de passageiro? ");
				navPassageiro.nome(naveNomepassageiro);	
				
				int pessoasAtuais = leia.lerInteiro("Qual a quantidade de tribulantes atuais na nave? ");
				navPassageiro.numerosPassageiros(pessoasAtuais);
				
				int opcTribulantes = leia.lerInteiro("Embarcar passageiro? 1- sim | 2- não");
				if (opcTribulantes == 1) {
					int numTribulantes = leia.lerInteiro("Embarcar quantos tribulantes? ");
					navPassageiro.embarcar(numTribulantes);
				}
				
				double combustivel = leia.lerDouble("Quantos litros tem de combustivel na nave?");
				navPassageiro.combustivel(combustivel);
				
				System.out.println("Gostaria de abastecer a nave? ");
				int opcAbastecer2 = leia.lerInteiro("1- sim | 2- nao");
				if (opcAbastecer2 == 1) {
					double abastecer = leia.lerDouble("Irá abastecer quantos litros ");
					navPassageiro.combustivel(abastecer);
				}
				

				double velocidadeMax2 = leia.lerDouble("qual a velocidade max da nave?");
				navPassageiro.velocidadeMax(velocidadeMax2);
				
				
				System.out.println("Comece sua jornadaaa acelera essa nave");

			        int opcDesacelerar2;
			        do {
			            double acelera = leia.lerDouble("Acelere digite a velocidade para começar.... (cuidado com o limite da velocidade maxima! )");
			            navPassageiro.acelerar(acelera);

			            opcDesacelerar2 = leia.lerInteiro("Quer acelerar mais? Digite 1 para sim ou qualquer outro número para não:");
			        } while (opcDesacelerar2 == 1);

				System.out.println("Agora desacelere");
				double desacelerar2 = leia.lerDouble("desacelera essa nave");
				navPassageiro.desacelerar(desacelerar2);


				System.out.println("Comece  a viajar pelas galaxias agora! ");
				int opcViajar2 = leia.lerInteiro("1- sim | 2- não");
				if(opcViajar2 == 1) {
					double distancia = leia.lerDouble("Quantos km irá viajar até o seu destino? ");
					navPassageiro.viajar(distancia);
				}

				navPassageiro.toString();
				break;
			case 3:
				System.out.println("Combate");
				String combate = leia.lerString("Qual sera o nome da sua nave de passageiro? ");
				navCombate.nome(combate);	
				
				int combatePessoasAtuais = leia.lerInteiro("Qual a quantidade de tribulantes atuais na nave? ");
				navCombate.numerosPassageiros(combatePessoasAtuais);
				
				
				double combustivelCombate = leia.lerDouble("Quantos litros tem de combustivel na nave?");
				navCombate.combustivel(combustivelCombate);
				
				System.out.println("Gostaria de abastecer a nave? ");
				int opcAbastecer3 = leia.lerInteiro("1- sim | 2- nao");
				if (opcAbastecer3 == 1) {
					double abastecer = leia.lerDouble("Irá abastecer quantos litros ");
					navCombate.combustivel(abastecer);
				}
				

				double velocidadeMax3= leia.lerDouble("qual a velocidade max da nave?");
				navCombate.velocidadeMax(velocidadeMax3);
				
				
				System.out.println("Comece sua jornadaaa acelera essa nave");

			        int opcDesacelerar3;
			        do {
			            double acelera = leia.lerDouble("Acelere digite a velocidade para começar .... (cuidado com o limite da velocidade maxima! )");
			            navCombate.acelerar(acelera);

			            opcDesacelerar3 = leia.lerInteiro("Quer acelerar mais? Digite 1 para sim ou qualquer outro número para não:");
			        } while (opcDesacelerar3 == 1);

				System.out.println("Agora desacelere");
				double desacelerar3 = leia.lerDouble("desacelera essa nave");
				navCombate.desacelerar(desacelerar3);


				System.out.println("Comece  a viajar pelas galaxias agora! ");
				int opcViajar3 = leia.lerInteiro("1- sim | 2- não");
				if(opcViajar3 == 1) {
					double distancia = leia.lerDouble("Quantos km irá viajar até o seu destino? ");
					navCombate.viajar(distancia);
				}
				
				System.out.println("/n Prepare os armamentos......");
				String arma = leia.lerString("Qual a arma de combate da sua nave? ");
				navCombate.setArmamento(arma);
				
				int opcAtaca = 0;
				int atacar = leia.lerInteiro("Inimigo a frente, deseja atacar? 1- sim | 2- não");
				
				if(atacar == 1) {
					do {			
						navCombate.atacar();
						opcAtaca = leia.lerInteiro("Deseja continuar atacando? 1- sim | qualquer outro número para não ");
					}while(opcAtaca == 1);
					
				}
				
				navCombate.toString();
				
				break;
			default:
				System.out.println("Não foi possivel acessar");
			}
		}
	}

}
