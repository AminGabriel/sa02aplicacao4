package com.banco;

public final class ContaPoupanca extends Conta {

	public ContaPoupanca(String numAgencia, String numConta, String tipodeconta, double saldo) {
		super(numAgencia, numConta, tipodeconta, saldo);
		// TODO Auto-generated constructor stub
		
	}
	
	public String depositarValor(double valor) {
		this.setSaldo(this.getSaldo() + valor + (0.0015 * valor));
		
		return "Déposito efetuado com sucesso!";
	}

}