package Sincronizacion;

public class Hilo2 extends Thread {

		public void run() {
			for( int i= 0; i<=5; i++) {
				System.out.print("E");
				
				try {
					Hilo2.sleep(1000);
				}catch(InterruptedException e) {
					System.out.println("Error en el hilo2" + e);
				}
			}
		}
	}

