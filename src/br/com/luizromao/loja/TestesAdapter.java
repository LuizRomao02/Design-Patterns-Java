package br.com.luizromao.loja;

import java.math.BigDecimal;

import br.com.luizromao.loja.http.ApacheHttpAdapter;
import br.com.luizromao.loja.orcamento.Orcamento;
import br.com.luizromao.loja.orcamento.RegistroOrcamento;

public class TestesAdapter {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
		orcamento.aprovar();
		orcamento.finalizar();

		RegistroOrcamento registro = new RegistroOrcamento(new ApacheHttpAdapter());
		registro.registrar(orcamento);
	}

}
