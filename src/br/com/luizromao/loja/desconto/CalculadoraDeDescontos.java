package br.com.luizromao.loja.desconto;

import java.math.BigDecimal;

import br.com.luizromao.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {
	
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
						new SemDesconto()));
		return desconto.calcular(orcamento);
	}

}
