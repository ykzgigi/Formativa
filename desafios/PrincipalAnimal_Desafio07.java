package AVformativa.desafios;

public class PrincipalAnimal_Desafio07 {

	public static void main(String[] args) {
	

				Lobo_Desafio07 lobo = new Lobo_Desafio07 ("Alfa", "M", "Qualquer");
				System.out.println("Nome: " + lobo.getNome());
				System.out.println("Sexo: " + lobo.getSexo());
				System.out.println("Raça: " + lobo.getRaca());
				lobo.emitirSom();
				lobo.caminhar();
				lobo.correr();
				lobo.dormir();

				System.out.println("            ");

				Leao_Desafio07 leao = new Leao_Desafio07 ("Simba", "M", "Qualquer");
				System.out.println("Nome: " + leao.getNome());
				System.out.println("Sexo: " + leao.getSexo());
				System.out.println("Raça: " + leao.getRaca());
				leao.emitirSom();
				leao.caminhar();
				leao.correr();
				leao.dormir();

				System.out.println("            ");


	}
}