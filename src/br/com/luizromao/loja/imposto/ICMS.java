package br.com.luizromao.loja.imposto;

import java.math.BigDecimal;

import br.com.luizromao.loja.orcamento.Orcamento;

public class ICMS {

	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

}
