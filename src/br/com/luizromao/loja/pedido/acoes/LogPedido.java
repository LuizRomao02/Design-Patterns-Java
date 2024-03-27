package br.com.luizromao.loja.pedido.acoes;

import br.com.luizromao.loja.pedido.Pedido;

public class LogPedido implements AcaoAposGerarPedido {

	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Pedido foi gerado! " + pedido.getData());
	}

}
