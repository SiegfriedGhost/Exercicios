package br.com.exercicios2;

public class Teste {

	public static void main(String[] args) {
		
		Cliente cli = new Cliente();
		
		Conta cc = new Conta();
		
		cc.setTitular(cli);
		
		//Inicializando variáveis 
		cli.setNome("ASD");
		cli.setCpf(1);
		cc.setAgencia(1);
		cc.setConta(2);
		cc.setSaldo(100.00);
		
		cc.credito(400.00, 'C');
		cc.debito(100.00, 'D');
		cc.credito(100.00, 'C');
		cc.debito(100.00, 'D');
		
		System.out.println("Nome: " + cli.getNome());
		System.out.println("CPF: " + cli.getCpf());
		System.out.println("Agencia: " + cc.getAgencia());
		System.out.println("Conta: " + cc.getConta());
		System.out.println("Saldo: " + cc.getSaldo());
		System.out.println("Total de Créditos: " + cc.getTotalCreditos());
		System.out.println("Total de Débitos: " + cc.getTotalDebitos());
		
		
		
		
	}
	
}
