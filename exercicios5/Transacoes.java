package br.com.exercicios5;

public class Transacoes {
	
	private char indicador;
	private double valor; 
	
	public Transacoes(char indicador, double valor) {
		this.indicador = indicador;
		this.valor = valor;
	}
	
	public char getIndicador() {
		return indicador;
	}

	public double getValor() {
		return valor;
	}


//	public double addLancamento(char indicador , double valor) {
//		if(indicador == 'C') {
//			credito(valor);
//		} else if(indicador == 'D') {
//			debito(valor);
//		}
//		return this.saldo; 
//	}
//	
//	private double credito(double valor) {
//		this.saldo = this.saldo + valor;
//		this.totalCreditos += valor; 
//	}
//	
//	private double debito(double valor) {
//		this.saldo = this.saldo - valor; 
//		this.totalDebitos += valor; 
//	}
	
	
	@Override
	public String toString() {
		return "{ indicador: " + indicador + ", valor: " + valor + " }";
	}

}
