package br.com.luizromao.loja.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.luizromao.loja.orcamento.situacao.EmAnalise;
import br.com.luizromao.loja.orcamento.situacao.Finalizado;
import br.com.luizromao.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento implements Orcavel {

	private List<Orcavel> itens;
	private BigDecimal valor;
	private SituacaoOrcamento situacao;

	public Orcamento() {
		this.valor = BigDecimal.ZERO;
		this.situacao = new EmAnalise();
		this.itens = new ArrayList<>();
	}

	public void aplicarDescontoExtra() {
		BigDecimal valorDescontoExtra = this.situacao.calcularDescontoExtra(this);
		this.valor = this.valor.subtract(valorDescontoExtra);
	}

	public void aprovar() {
		this.situacao.aprovar(this);
	}

	public void reprovar() {
		this.situacao.reprovar(this);
	}

	public void finalizar() {
		this.situacao.finalizar(this);
	}

	public BigDecimal getValor() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		} //simulando lentidao
		
		return this.valor;
	}

	public int getQuantidadeItens() {
		return itens.size();
	}

	public SituacaoOrcamento getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}

	public boolean isFinalizado() {
		return this.situacao instanceof Finalizado;
	}

	public void adicionarItem(Orcavel item) {
		this.valor = this.valor.add(item.getValor());
		this.itens.add(item);
	}

}
