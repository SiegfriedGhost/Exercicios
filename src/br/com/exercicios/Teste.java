package br.com.exercicios;

public class Teste {

	public static void main(String[] args) {

		Cliente cli = new Cliente();
		cli.setCpf(2);
		cli.setNome("ASD");
		
		Conta cc = new Conta();

		//Composi��o de Objetos 
		cc.setTitular(cli);

		cc.setAgencia(1);
		cc.setConta(1);
		
		//Composi��o de Objetos 
		Operacao opp = new Operacao();
		opp.setConta(cc);
		
		
		

		
//		cc.operacao('C', 100.0);
//		cc.operacao('C', 100.0);
//		cc.operacao('D', 100.0);
//		
//		System.out.println(cc.getTitular().getNome());
//		System.out.println(cc.getTitular().getCpf());
//		System.out.println(cc.getAgencia());
//		System.out.println(cc.getConta());
//		System.out.println(cc.getSaldo());

		
		
		
	}
}
