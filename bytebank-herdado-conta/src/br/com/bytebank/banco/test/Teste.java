package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuadadorDeContas;

public class Teste {

	public static void main(String[] args) {

		GuadadorDeContas guadador = new GuadadorDeContas();

		Conta cc = new ContaCorrente(22, 11);
		guadador.adicionar(cc);

		Conta cc2 = new ContaCorrente(22, 11);
		guadador.adicionar(cc2);

		int tamanho = guadador.getquatidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guadador.getReferencias(0);

	}

}
