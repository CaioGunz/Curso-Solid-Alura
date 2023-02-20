package br.com.caio.rh.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.caio.rh.ValidacaoException;
import br.com.caio.rh.model.Funcionario;


public class ReajusteService {

	public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
		BigDecimal salario = funcionario.getSalario();
		BigDecimal percentualReajuste = aumento.divide(salario, RoundingMode.HALF_DOWN);
		if(percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
		}
		BigDecimal salarioReajstado = salarioAtual.add(aumento);
		funcionario.atalizarSalario();
		
	}
	
}
