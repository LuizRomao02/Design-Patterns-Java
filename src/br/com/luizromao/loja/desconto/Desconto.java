package br.com.luizromao.loja.desconto;

import java.math.BigDecimal;

import br.com.luizromao.loja.Orcamento;

public abstract class Desconto {

	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}

	public abstract BigDecimal calcular(Orcamento orcamento);

}
