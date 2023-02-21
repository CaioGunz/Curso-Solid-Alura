package br.com.caio.rh.service.promocao;

import br.com.caio.rh.ValidacaoException;
import br.com.caio.rh.model.Cargo;
import br.com.caio.rh.model.Funcionario;

public class PromocaoService {

	public void promover (Funcionario funcionario, boolean metaBatida) {
		Cargo cargoAutal =  funcionario.getCargo();
		if(Cargo.GERENTE == cargoAutal) {
			throw new ValidacaoException("Gerentes não podem ser promovidos.");
		}
		
		if(metaBatida) {
			Cargo novoCargo = cargoAutal.getProximoCargo();
			funcionario.promover(novoCargo);
		} else {
			throw new ValidacaoException("Funcionario não bateu a meta.");
		}
		
	}
	
}
