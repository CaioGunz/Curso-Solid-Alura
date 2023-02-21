package br.com.caio.rh.service;

import java.math.BigDecimal;
import java.util.List;

import br.com.caio.rh.model.Funcionario;


public class ReajusteService {
	
	private List<ValidacaoReajuste> validacoes;
	
	

	public ReajusteService(List<ValidacaoReajuste> validacoes) {
		this.validacoes = validacoes;
	}



	public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
		
		this.validacoes.forEach(v -> v.validar(funcionario, aumento));
		
		BigDecimal salarioReajstado = funcionario.getSalario().add(aumento);
		funcionario.atualizarSalario(salarioReajstado);
		
	}
	
}
