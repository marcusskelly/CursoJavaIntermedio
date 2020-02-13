package numerosaleatorios;
import java.util.Random;

public class Clase_dos {

	public static void main(String[] args) {
		int aleatorio = 0;
		
		Random r = new Random();
		
		aleatorio = (int) (r.nextDouble()*100);
		System.out.println(aleatorio);

	}

}
