package br.com.luizromao.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.luizromao.loja.pedido.GeraPedido;
import br.com.luizromao.loja.pedido.GeraPedidoHandler;
import br.com.luizromao.loja.pedido.acoes.CriarPedidoNoBanco;
import br.com.luizromao.loja.pedido.acoes.EnviarPedidoPorEmail;
import br.com.luizromao.loja.pedido.acoes.LogPedido;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "Ana da Silva";
		BigDecimal valorOrcamento = new BigDecimal("745.99");
		int quantidadeItens = 3;
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(
				new EnviarPedidoPorEmail(),
				new CriarPedidoNoBanco(),
				new LogPedido()));
		handler.executar(gerador);
	}

}
