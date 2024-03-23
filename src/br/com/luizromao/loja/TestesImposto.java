package br.com.luizromao.loja;

import java.math.BigDecimal;

import br.com.luizromao.loja.imposto.ICMS;
import br.com.luizromao.loja.imposto.ISS;
import br.com.luizromao.loja.imposto.Imposto;
import br.com.luizromao.loja.orcamento.Orcamento;

public class TestesImposto {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);

		Imposto imposto = new ICMS(new ISS(new ICMS(null)));
		System.out.println(imposto.calcular(orcamento));
	}

}
