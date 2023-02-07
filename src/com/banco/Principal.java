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
