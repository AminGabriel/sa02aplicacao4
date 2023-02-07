package com.banco;

public abstract class Conta {
    //atributos
	private String numAgencia;
	private String numConta;
	private String tipodeconta;
	private double saldo;
	 
	// Construtor
	public Conta(String numAgencia, String numConta, String tipodeconta, double saldo) {
		// TODO Auto-generated constructor stub
		this.numAgencia = numAgencia;
		this.numConta = numConta;
		this.tipodeconta = tipodeconta;
		this.setSaldo(saldo);
	}
 
	// Métodos
	public String consultarDadosConta() {
		return "Número da agência: " + this.numAgencia + ".\nNúmero da conta: " + this.numConta + ".";
	}
    
	public String depositarValor(double valor) {
		this.setSaldo(this.getSaldo() + valor);
		
		return "Déposito efetuado com sucesso!";
	}
	
	public String sacarValor(double valor) {
		if (this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			
			return "Saque efetuado com sucesso!";
		}
		else
			return "Não foi possível efetuar o saque!";
	}
	
	public double consultarSaldo() {
		return this.getSaldo();
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
