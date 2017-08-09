package com.gft;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.gft.model.Funcionario;
import com.gft.model.Funcionario.Tipo;
import com.gft.service.FuncionarioService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TddApplicationTests {

	FuncionarioService service = new FuncionarioService();
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testeDescontoDesenvolvedorMenorQue3000() {
		Funcionario func = new Funcionario("Teste1",Tipo.DESENVOLVEDOR, 1500.00);
		double salario = service.calculaSalarioComDesconto(func);
		assertThat(1500.0 * 0.9, is(equalTo(salario)));
	}
	
	@Test
	public void testeDescontoDBAMenorQue3000() {
		Funcionario func = new Funcionario("Teste1",Tipo.DBA, 1500.00);
		double salario = service.calculaSalarioComDesconto(func);
		assertThat(1500.0 * 0.85, is(equalTo(salario)));
	}
	
	@Test
	public void testeDescontoDesenvolvedorMaiorQue3000() {
		Funcionario func = new Funcionario("Teste1",Tipo.DESENVOLVEDOR, 3500.00);
		double salario = service.calculaSalarioComDesconto(func);
		assertThat(3500.0 * 0.8, is(equalTo(salario)));
	}

	@Test
	public void testeDescontoDBATESTERMaiorQue3000() {
		Funcionario func = new Funcionario("Teste1",Tipo.DBA, 3500.00);
		double salario = service.calculaSalarioComDesconto(func);
		assertThat(3500.0 * 0.75, is(equalTo(salario)));
	}
	
	

}
