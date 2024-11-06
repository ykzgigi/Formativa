package AVformativa.desafios;

public class Lobo_Desafio07 extends Animal_Desafio07{

	public Lobo_Desafio07(String nome, String sexo, String raca) {
		super(nome,sexo,raca);
	}

	@Override
	public void emitirSom() {
		System.out.println("O lobo está uivando");
	}

}
