package br.com.exercicios2;

import java.math.BigDecimal;

public class Conta {
	
	private int agencia;
	private int conta; 
	private double saldo;
	static double totalCreditos; 
	static double totalDebitos;
	private Cliente titular;
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public static double getTotalCreditos() {
		return totalCreditos;
	}

	public static void setTotalCreditos(double totalCreditos) {
		Conta.totalCreditos = totalCreditos;
	}

	public static double getTotalDebitos() {
		return totalDebitos;
	}

	public static void setTotalDebitos(double totalDebitos) {
		Conta.totalDebitos = totalDebitos;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public double credito(double valor, char indicador) {
		if(indicador == 'C') {
			this.saldo = this.saldo + valor;
			this.totalCreditos += valor;
			}
		return this.saldo;
	}
	
	public double debito(double valor, char indicador) {
		if(indicador == 'D') {
			this.saldo = this.saldo - valor;
			this.totalDebitos += valor;
		}		
		return this.saldo; 		
	}
}
