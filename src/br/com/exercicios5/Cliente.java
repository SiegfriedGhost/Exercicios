package br.com.exercicios5;

import java.util.ArrayList;
import java.util.List;


public class Cliente {

	private String nome;
	private int cpf; 
	private List<Transacoes> trans = new ArrayList<Transacoes>(); 
	
	public Cliente(String nome, int cpf) {
		this.nome = nome;
		this.cpf = cpf;

	}

	
	public String getNome() {
		return nome;
	}

	public int getCpf() {
		return cpf;
	}

	public List<Transacoes> getTrans() {
		return trans;
	}
	
	public void adiciona(Transacoes trs) {
		this.trans.add(trs);
	}
	
	@Override
	public String toString() {
	
		return "{ cliente: " + "{ Nome: " + nome + ", CPF: " + cpf + " { Transacoes: " + this.trans;
	}
	
}
