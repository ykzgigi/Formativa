package AVformativa.desafios;

public class PessoaCons_Desafio05 {
	
	private String nome;
	private int idade;
	
	//método contrutor vazio
		public PessoaCons_Desafio05( ) {
			
		}

	public PessoaCons_Desafio05(String nome, int idade) {
	this.nome = nome;
	this.idade = idade; 
		
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
		
		
	}
	
	

}
