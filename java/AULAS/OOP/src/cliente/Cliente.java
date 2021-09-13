package cliente;

public class Cliente {
	private String nome;
	private int anoNascimento;
	private boolean ativo;
	private char pronome;
	private String resposta="";
	private String cpf;
	
	//Construtor com um parametro
	public Cliente(String cpf){
		this.cpf = cpf;
	}
	
	//Construtor com dois parametros obrigatórios
	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}


	//Encapsulamento
	
	//Gets e Sets
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public char getPronome() {
		return pronome;
	}
	public void setPronome(char pronome) {
		this.pronome = pronome;
	}
	public String getResposta() {
		return resposta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	//Método que retorna
	public int calculeIDade(){
		return (2021-this.anoNascimento);
	}
	//Sobrecarga de método
	public int calculeIdade(int anoAtual){
		return (anoAtual-this.anoNascimento);
	}
	
	//Método que não retorna
	public void ativarCliente() {
		ativo = true;
	}
	public void desativarCliente() {
		ativo = false;
	}
	
	//Método que retorna passando parametro obrigatório
	public String tratamento(char codigo){
	
		if(codigo=='1') {
			this.resposta = "Senhor";
		}else if (codigo == '2') {
			this.resposta = "Senhora";
		}else if (codigo =='3') {
			this.resposta = "Senhore";
		}else {
			this.resposta = "Senhorx";
		}
		return this.resposta;
	}

}
