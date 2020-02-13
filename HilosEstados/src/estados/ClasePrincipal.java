package estados;

public class ClasePrincipal {

	public static void main(String[] args) {
		
		Hilo_Proceso hilo1 = new Hilo_Proceso();//en proceso
		Hilo_Proceso hilo2 = new Hilo_Proceso();
		
		hilo1.start();//ejecutable
		
		try {
			hilo1.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println("Error en el hilo1 " + e);
		}

		hilo2.start();
		
		try {
			hilo2.sleep(1000);//estado sleep que requiere trycatch
		}catch(InterruptedException e) {
			System.out.println("Error en hilo 2");
		}
	}

}
