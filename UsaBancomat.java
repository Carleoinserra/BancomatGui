package application;

public class UsaBancomat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bancomat b1 = new Bancomat();
		b1.addConto(new ContoCorrente("1234", 20000));
		b1.addConto(new ContoCorrente("1235", 100000));
		
		b1.preleva("1235", 5000);
		System.out.println(b1.getSaldo("1235"));
		
		b1.versa("1234", 1000);
		System.out.println(b1.getSaldo("1234"));

	}

}
