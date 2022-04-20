package br.com.bytebank.banco.modelo;

public class GuadadorDeContas {

	private Conta[] referencias;
	private int posicaoLivre;

	public GuadadorDeContas() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}

	public void adicionar(Conta ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int getquatidadeDeElementos() {
		return this.posicaoLivre;
	}

	public Conta getReferencias(int pos) {
		return this.referencias[pos];
	}
}
