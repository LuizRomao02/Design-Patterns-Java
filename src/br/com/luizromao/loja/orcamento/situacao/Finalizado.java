package br.com.luizromao.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.luizromao.loja.DomainException;
import br.com.luizromao.loja.orcamento.Orcamento;

public class Finalizado extends SituacaoOrcamento {

	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		throw new DomainException("Orcamento finalizado nao pode ter desconto extra!");
	}

}
