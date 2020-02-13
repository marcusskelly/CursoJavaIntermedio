package hilos;

public class ClasePrincipal {

	public static void main(String[] args) {
	
		Proceso1 hilo1 = new Proceso1();//herencia
		Thread hilo2 = new Thread(new Proceso2());//hilo
		
		hilo1.start();
		hilo2.start();

	}

}
