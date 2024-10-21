package application;

import java.util.ArrayList;

public class Bancomat {
	
	ArrayList <ContoCorrente> listaC;
	
	public Bancomat() {
		
		
		listaC = new ArrayList<>();
		
		
	}
	
	public void addConto(ContoCorrente c1) {
		
		listaC.add(c1);
	}
	
	public boolean preleva(String pin, double importo) {
		
		boolean ok = false;
		
		for (ContoCorrente c1: listaC) {
			
			if (c1.pin.equalsIgnoreCase(pin)) {
				
				if (c1.saldo >= importo) {
					
					c1.saldo -= importo;
					ok = true;
				}
			}
		}
		
		return ok;
	}
public boolean versa(String pin, double importo) {
		
		boolean ok = false;
		
		for (ContoCorrente c1: listaC) {
			
			if (c1.pin.equalsIgnoreCase(pin)) {
				
				
					
					c1.saldo += importo;
					ok = true;
				}
			}
		
		
		return ok;
	}

public double gestSaldo(String pin) {
	double saldo = 0;
	for (ContoCorrente c1: listaC) {
		
		if (c1.pin.equalsIgnoreCase(pin)) {
			
			
				saldo = c1.saldo;
				
			}
		}
	
	return saldo;
	
	
}
	

}
