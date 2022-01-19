package br.com.exercicios5;

import java.util.ArrayList;
import java.util.List;

public class testeCliente {

	public static void main(String[] args) {
		
//		List<Cliente> cliente = new ArrayList<>();
//		
//		cliente.add(new Cliente("Leandro", 21));
//		
//		System.out.println(cliente);
		
		Cliente cli = new Cliente("Leandro",21);
		
		cli.adiciona(new Transacoes('C', 200.0));
		cli.adiciona(new Transacoes('D', 100.0));
		cli.adiciona(new Transacoes('C', 300.0));
		cli.adiciona(new Transacoes('D', 500.0));
		
		
		System.out.println(cli);
		
		
		
		
		
		
		
		
	}
	
}
