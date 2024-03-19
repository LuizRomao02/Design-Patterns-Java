package br.com.luizromao.loja.imposto;

import java.math.BigDecimal;

import br.com.luizromao.loja.orcamento.Orcamento;

public interface Imposto {

	BigDecimal calcular(Orcamento orcamento);
}
