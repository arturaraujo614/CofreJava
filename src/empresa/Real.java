package empresa;

import java.util.Objects;

public class Real extends Moeda{

	private double fatorConversao = 1.0;

	public Real(double valor) {
		super(valor);
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
		return "Você possui: " + saldo + " reais";
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
		Real other = (Real) obj;
		return Double.doubleToLongBits(fatorConversao) == Double.doubleToLongBits(other.fatorConversao);
	}
}