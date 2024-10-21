package application;

import java.util.ArrayList;

/*
 * Andiamoa creare una lista di conticorrenti dando la possibilità di svolgere alcune funzionalità
 */

public class Bancomat {
	
	ArrayList <ContoCorrente> listaC;
	
	public Bancomat() {
		
		
		listaC = new ArrayList<>();
		
		
	}
/*
 * E' possibile aggiungere un nuovo contocorrente alla lista	
 */
	public void addConto(ContoCorrente c1) {
		
		listaC.add(c1);
	}
/*
 * Prelevare da un contocorrente inserenso pin e importo	
 */
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
	
/*
 * 
 * Versare su un contocorrente inserenso pin e importo
 */
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
/*
 * 
 * Il metodo getSaldo restituisce il saldo corrente do un conto a partire dal suo pin
 */
public double getSaldo(String pin) {
	double saldo = 0;
	for (ContoCorrente c1: listaC) {
		
		if (c1.pin.equalsIgnoreCase(pin)) {
			
			
				saldo = c1.saldo;
				
			}
		}
	
	return saldo;
	
	
}
/* il metodo getAccesso ci consente di verificare se il pin corrisponde ai pin della lista di conti
 */
public boolean getAccesso(String pin) {
	
	boolean ok = false;
for (ContoCorrente c1: listaC) {
		
		if (c1.pin.equalsIgnoreCase(pin)) {
			
			
				ok = true;
				
			}
		}
	
	return ok;
	
	
}
	

}
