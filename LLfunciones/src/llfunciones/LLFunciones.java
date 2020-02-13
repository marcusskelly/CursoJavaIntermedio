package llfunciones;

public class LLFunciones {

	private int kilos= 0, llenadoCompleto = 0, tipoDeRopa = 0, lavadoCompleto = 0, secadoCompleto = 0;
	
	public LLFunciones(int kilos, int tipoDeRopa) {
		this.kilos = kilos;
		this.tipoDeRopa = tipoDeRopa;
	}
	
	private void Llenado() {
		if(kilos <= 12) {
			llenadoCompleto=1;
			System.out.println("Llenando...");
			System.out.println("Llenado Completo");
		}else {
			System.out.println("Reduce la carga");
		}
	}
	private void Lavado() {
		Llenado();
		if(llenadoCompleto==1) {
			if(tipoDeRopa==1) {
				System.out.println("Ropa blanca/Lavado suave");
				System.out.println("Lavando...");
				lavadoCompleto=1;
			}else if(tipoDeRopa==2){
				System.out.println("Ropa de color/lavado intenso");
				System.out.println("Lavando...");
				lavadoCompleto = 1;		
			}else {
				System.out.println("El tipo de ropa no está disponible");
				System.out.println("Se lavara como ropa de color/ Lavado intenso");
				lavadoCompleto =1;
			}
		}
	}
	
	public void Secado() {
		Secado();
		if(lavadoCompleto==1) {
			System.out.println("Secando");
			secadoCompleto=1;
		}
	}
	public void CicloFinalizado() {
		Secado();
		if(secadoCompleto==1) {
			System.out.println("Tu ropa esta lista");
		}
	}
	
	public int gettipoDeRopa() {
		return tipoDeRopa;
	}
	public void settipoDeRopa(int tipoDeRopa) {
		this.tipoDeRopa = tipoDeRopa;
	}
	
}


