
public class Cliente {

	private String nome;
	private Conta conta;

	


	public Cliente() {
		this.nome = nome;
		this.conta = new ContaPoupanca(null);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


}
