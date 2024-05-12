package empresa;

import java.util.Objects;

public abstract class Moeda {
	double saldo;
	
	public Moeda(double saldo) {
		super();
		this.saldo = saldo;
	}
	
	//Funções Obrigatórias para filhas
	abstract void depositar(double valor);
	abstract void sacar(double valor) throws Exception;
	abstract double conversao();
	abstract double adicionar();

	
	@Override
	public int hashCode() {
		return Objects.hash(saldo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(saldo) == Double.doubleToLongBits(other.saldo);
	}


	
	
	
}
