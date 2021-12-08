package br.com.exercicios;

public class Operacao {
	
	
	private char indicador;
	private double valor;
	private Conta conta;
	
	public char getIndicador() {
		return indicador;
	}
	public void setIndicador(char indicador) {
		this.indicador = indicador;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta cc) {
		this.conta = cc;
	}
	
	public double transacao(char indicador, double valor) {
		if (indicador == 'C') {
			return conta.setSaldo() = conta.getSaldo() - this.valor;
		}
	}
	
	
	
}
