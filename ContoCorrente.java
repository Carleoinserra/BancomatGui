package application;
/*
 * La classe contocorrente ha 2 variabili d'istanza che sono il pin associato al conto
 * e il saldo sempre associato
 */
public class ContoCorrente {
	
	String pin;
	double saldo;
	
	public ContoCorrente(String pin, double saldo) {
		
		this.pin = pin;
		this.saldo = saldo;
	}
	
	
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	@Override
	public String toString() {
		return "ContoCorrente [pin=" + pin + ", saldo=" + saldo + "]";
	}
	
	
	
	

}
