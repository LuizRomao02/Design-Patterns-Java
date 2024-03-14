package br.com.luizromao.loja.desconto;

import java.math.BigDecimal;

import br.com.luizromao.loja.Orcamento;

public class SemDesconto extends Desconto {
	
	public SemDesconto() {
		super(null);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

}
