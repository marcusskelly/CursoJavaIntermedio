package clases;

public class ClaseHija_Deposito extends ClasePadre_Abstracta{

	@Override
	public void Transacciones() {
		System.out.println("Cuanto desea depositar: ");
		Deposito();
		
		transacciones = getSaldo();
		setSaldo(transacciones + deposito);
		System.out.println("----------------------------------");
		System.out.println("Depositaste: " + deposito);
		System.out.println("Tu saldo actual es: " + getSaldo());
		System.out.println("----------------------------------");
	}
}
