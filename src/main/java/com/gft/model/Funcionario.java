package com.gft.model;


public class Funcionario {
	
	public enum Tipo {
		DESENVOLVEDOR,
		DBA,
		TESTER
	}
	
	Tipo tipo;

	String nome;
	
	double salario;
	
	public Funcionario(String nome, Tipo tipo, double salario) {
		this.nome = nome;
		this.tipo = tipo;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

}
