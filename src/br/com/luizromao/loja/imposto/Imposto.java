package br.com.luizromao.loja.imposto;

import java.math.BigDecimal;

import br.com.luizromao.loja.Orcamento;

public interface Imposto {

	BigDecimal calcular(Orcamento orcamento);

}
