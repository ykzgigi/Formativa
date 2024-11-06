package AVformativa.desafios;

public class Objetos_Desafio01 {

	public static void main(String[] args) {
		
		Pessoa_Desafio01 pe1 = new Pessoa_Desafio01 (); //CRIAÇÃO DOS OBJETOS
			
		Pessoa_Desafio01 pe2 = new Pessoa_Desafio01 ();
		
		
		pe1.setNome("Tom Cruise");
		pe1.setIdade(60);
		pe1.setEndereco("California USA");
		pe1.setProfissao("Ator");
		
		pe2.setNome("Messi");
		pe2.setIdade(35);
		pe2.setEndereco("Miami USA");
		pe2.setProfissao("Jogador de futebol");
		
		System.out.println(" ");
		System.out.println("~~~~~~~~PESSOA 01~~~~~~~~~");
		System.out.println(" ");
		
		System.out.println(pe1.getNome());
		System.out.println(pe1.getIdade());
		System.out.println(pe1.getEndereco());
		System.out.println(pe1.getProfissao());
		
		System.out.println(" ");
		System.out.println("~~~~~~~~PESSOA 02~~~~~~~~~");
		System.out.println(" ");
		
		
		System.out.println(pe2.getNome());
		System.out.println(pe2.getIdade());
		System.out.println(pe2.getEndereco());
		System.out.println(pe2.getProfissao());

	}

}
