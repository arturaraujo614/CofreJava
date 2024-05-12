package empresa;

import java.util.Objects;

public class Dolar extends Moeda{
	// Conversão arbitrária.
	private double fatorConversao = 5.1;


	public Dolar(double saldo) {
		super(saldo);
	}
	
	@Override
	public double conversao() {
		return saldo*fatorConversao;
	}
	
	@Override
	public double adicionar() {
		return saldo;
	}
	
	@Override
	public void depositar(double valor) {
		saldo += valor;
	}
	
	@Override
	public void sacar(double valor) throws Exception {
		if (valor > saldo) {
			throw new Exception("Saldo insuficiente");
		}
		if (valor<0) {
			throw new Exception("Valor invalido");
		}
		saldo -= valor;
	}

	@Override
	public String toString() {
		return "Você possui: " + saldo + " dólares";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(fatorConversao);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dolar other = (Dolar) obj;
		return Double.doubleToLongBits(fatorConversao) == Double.doubleToLongBits(other.fatorConversao);
	}

}

