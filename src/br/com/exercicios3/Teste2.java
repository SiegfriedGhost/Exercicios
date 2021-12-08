package br.com.exercicios3;

public class Teste2 {
	
	public double addLancamento(double valor, char indicador) {
		if(indicador == 'C') {
			this.saldo = this.saldo + valor; 
			this.totalCreditos += valor;
		}else if(indicador == 'D') {
			this.saldo = this.saldo - valor;
			this.totalDebitos += valor; 
		}
		return this.saldo;
	}
	
	
	public double addLancamento(double valor, char indicador) {
		if(indicador == 'C') {
			credito(valor);
		} else if(indicador == 'D') {
			debito(valor);
		}
		return this.saldo; 
	}
	
	private double credito(double valor) {
		this.saldo = this.saldo + valor;
		this.totalCreditos += valor; 
	}
	
	private double debito(double valor) {
		this.saldo = this.saldo - valor; 
		this.totalDebitos += valor; 
	}
	
	
	List<Lancamento> listaLancamentos = new ArrayList<Lancamento>();
	listaLancamentos.add(new Lancamento(400.00 , 'C'));
	listaLancamentos.add(new Lancamento(100.00 , 'D'));
	
	calcularSaldo(listaLancamentos)
	
	
	for() {
		if(listaLancamentos.get(i).getIndicador() == 'C' || listaLancamentos.get(i).getIndicador() == 'P') {
			credito(listaLancamentos.get(i).getValor(), listaLancamentos.get(i).getIndicador());
		} else if (listaLancamentos.get(i).getIndicador() == 'D') {
			debito(listaLancamentos.get(i).getValor(), listaLancamentos.get(i).getIndicador());
		}
	}
	
	
	for() {
		addLancamento(listaLancamentos.get(i));
	}
	
	

}
