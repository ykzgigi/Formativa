package AVformativa.desafios;

public class ConstrutorPessoa_Desafio05 {

	public static void main(String[] args) {
		
		
		PessoaCons_Desafio05 jogador1 = new PessoaCons_Desafio05();
		
		PessoaCons_Desafio05 jogador2  = new PessoaCons_Desafio05("Messi",36);
		
		
		
		System.out.println(jogador2.getNome());
		System.out.println(jogador2.getIdade());
	}

}
