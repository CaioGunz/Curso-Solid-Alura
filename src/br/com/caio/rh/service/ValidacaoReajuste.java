package br.com.caio.rh.service;

import java.math.BigDecimal;

import br.com.caio.rh.model.Funcionario;

public interface ValidacaoReajuste {
	
	 void validar (Funcionario funcionario, BigDecimal aumento);

}
