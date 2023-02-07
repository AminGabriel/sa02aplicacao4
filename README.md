# Aplicativo de banco

## Banco com conta corrente e conta poupança

## Classe principal
````
package com.banco;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instancia os objetos
		Pessoa cliente = new Pessoa(10001);
		ContaCorrente contacorrente = new ContaCorrente("6666-4", "88.999-00", null, 0);
		ContaPoupanca contapoupanca = new ContaPoupanca("6666-4", "88.999-00", null, 0);
		// Declaração de variável
		String valor;
	    
		// declarar o array
		Object[] opcoes = {"Consultar dados da conta", "Conta corrente", "Conta poupança", "Sair"};
		Object opcao;
		
		// recebe os dados do cliente 
		cliente.setNome(JOptionPane.showInputDialog("Informe o nome do cliente:"));
		cliente.setTelefone(JOptionPane.showInputDialog("Informe o telefone do cliente:"));
		cliente.setProfissao(JOptionPane.showInputDialog("Informe a profissão do cliente:"));
		// loop
		do {
			opcao = JOptionPane.showInputDialog(null, "Escolha o que deseja fazer:", "Caixa eletrônico",JOptionPane.INFORMATION_MESSAGE,null, opcoes, opcoes[0]);
			if (opcao == "Consultar dados da conta")
				JOptionPane.showMessageDialog(null, contacorrente.consultarDadosConta() +".\n" + "Nome do cliente: " + cliente.getNome() + ".\n" + "Telefone do cliente: " + cliente.getTelefone() + ".\n" + "Profissão do cliente: " + cliente.getProfissao());
			
			else if(opcao == "Conta corrente") {	
				
				Object[] opcoees = { "Consultar saldo", "Depositar", "Sacar", "Voltar"};
				Object opcaao;
				do {
					// Informa para o cliente as opções
					opcaao = JOptionPane.showInputDialog(null, "Escolha o que deseja fazer:", "Caixa eletrônico",JOptionPane.INFORMATION_MESSAGE,null, opcoees, opcoees[0]);
					
					// realiza o desejo do cliente
						
					if (opcaao == "Consultar saldo")
						JOptionPane.showMessageDialog(null, "Saldo da conta: R$ " + contacorrente.consultarSaldo() + ".");
					else if (opcaao == "Depositar") {
						valor = JOptionPane.showInputDialog("Informe o valor do déposito em reais:");
						valor = valor.replace(",", ".");
						valor = contacorrente.depositarValor(Double.parseDouble(valor));
						JOptionPane.showMessageDialog(null, valor);
					}
					else if (opcaao == "Sacar") {
						valor = JOptionPane.showInputDialog("Informe o valor do saque em reais:");
						valor = valor.replace(",", ".");
						valor = contacorrente.sacarValor(Double.parseDouble(valor));
						JOptionPane.showMessageDialog(null, valor);
					}
				
				}while(opcaao != "Voltar");
				
			}
			else if(opcao == "Conta poupança") {
				
				Object[] opcoees = {"Consultar saldo", "Depositar", "Sacar", "Voltar"};
				Object opcaao;
				// Informa para o cliente as opções
				do {
					opcaao = JOptionPane.showInputDialog(null, "Escolha o que deseja fazer:", "Caixa eletrônico",JOptionPane.INFORMATION_MESSAGE,null, opcoees, opcoees[0]);
					
					// realiza o desejo do cliente 
						
					if (opcaao == "Consultar saldo")
						JOptionPane.showMessageDialog(null, "Saldo da conta: R$ " + contapoupanca.consultarSaldo() + ".");
					else if (opcaao == "Depositar") {
						valor = JOptionPane.showInputDialog("Informe o valor do déposito em reais:");
						valor = valor.replace(",", ".");
						valor = contapoupanca.depositarValor(Double.parseDouble(valor));
						JOptionPane.showMessageDialog(null, valor);
					}
					else if (opcaao == "Sacar") {
						valor = JOptionPane.showInputDialog("Informe o valor do saque em reais:");
						valor = valor.replace(",", ".");
						valor = contapoupanca.sacarValor(Double.parseDouble(valor));
						JOptionPane.showMessageDialog(null, valor);
					}
				
				}while(opcaao != "Voltar");
			}
			else
				JOptionPane.showMessageDialog(null, "Obrigado pela preferência!");
		
			
		}while(opcao != "Sair");
		// encerra o programa
		System.exit(0);
	}
	
}
````

## Classe conta poupança
````
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
````

## Classe conta corrente
````
package com.banco;

public final class ContaCorrente extends Conta {

	public ContaCorrente(String numAgencia, String numConta, String tipodeconta, double saldo) {
		super(numAgencia, numConta, tipodeconta, saldo);
		// TODO Auto-generated constructor stub
	}

}
````

## Classe pessoa
````
package com.banco;

public class Pessoa {

	// Atributos
	public int idPessoa;
	public String nome;
	public String telefone; 
	public String profissao;
	
 
	// Construtor
	public Pessoa(int idPessoa) {
		// TODO Auto-generated constructor stub
		this.idPessoa = idPessoa;
	}


	public int getIdPessoa() {
		return idPessoa;
	}


	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getProfissao() {
		return profissao;
	}


	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
````


## Classe conta
````
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
````