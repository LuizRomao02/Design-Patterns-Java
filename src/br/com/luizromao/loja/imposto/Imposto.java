package br.com.luizromao.loja.imposto;

import java.math.BigDecimal;

import br.com.luizromao.loja.orcamento.Orcamento;

public abstract class Imposto {

	private Imposto outro;

	public Imposto(Imposto outro) {
		this.outro = outro;
	}

	protected abstract BigDecimal realizarCalculoEspecifico(Orcamento orcamento);

	public BigDecimal calcular(Orcamento orcamento) {
		BigDecimal valorImposto = realizarCalculoEspecifico(orcamento);
		BigDecimal valorOutroImposto = BigDecimal.ZERO;
		if (outro != null) {
			valorOutroImposto = outro.realizarCalculoEspecifico(orcamento);
		}

		return valorImposto.add(valorOutroImposto);
	}

}
