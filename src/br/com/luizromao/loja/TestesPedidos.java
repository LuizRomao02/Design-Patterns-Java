package br.com.luizromao.loja;

import java.math.BigDecimal;

import br.com.luizromao.loja.pedido.GeraPedido;
import br.com.luizromao.loja.pedido.GeraPedidoHandler;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "Ana da Silva";
		BigDecimal valorOrcamento = new BigDecimal("745.99");
		int quantidadeItens = 3;
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler();
		handler.executar(gerador);
	}

}
