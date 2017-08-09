package com.gft.service;

import com.gft.model.Funcionario;
import com.gft.model.Funcionario.Tipo;

public class FuncionarioService {
	
	public double calculaSalarioComDesconto(Funcionario funcionario) {
		double retorno = 0.0;
		if (funcionario.getTipo() == Tipo.DESENVOLVEDOR) {
			if (funcionario.getSalario() > 3000.00) {
				retorno = funcionario.getSalario()*0.8;
			} else {
				retorno = funcionario.getSalario()*0.9;
			}
		}
			
		if (funcionario.getTipo() == Tipo.DBA || funcionario.getTipo() == Tipo.TESTER) {
			if (funcionario.getSalario() > 2500) {
				retorno = funcionario.getSalario()*0.75;
			} else {
				retorno = funcionario.getSalario()*0.85;
			}
		}
		return retorno;
	}
}
