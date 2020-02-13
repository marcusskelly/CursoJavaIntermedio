package conversiones;

public class FuncionesTrigonometricas {

	public static void main(String[] args) {
		double resultado = 0;
		double anguloEnGrados = 45;
		double anguloEnRadianes = Math.toRadians(anguloEnGrados);
		
		
		resultado = Math.sin(anguloEnRadianes);
		System.out.println("Seno de " + anguloEnGrados + "º" + resultado);
		
		resultado = Math.cos(anguloEnRadianes);
		System.out.println("coSeno de " + anguloEnGrados + "º" + resultado);
		
		resultado = Math.tan(anguloEnRadianes);
		System.out.println("Tangente de " + anguloEnGrados + "º" + resultado);
		
		double valorIngresado= 0.707;
		
		anguloEnRadianes = Math.acos(valorIngresado);
		anguloEnGrados = Math.toDegrees(anguloEnRadianes);
		System.out.println("Arco coseno de: " + valorIngresado + "=" + anguloEnGrados + "º");
		
		anguloEnRadianes = Math.asin(valorIngresado);
		anguloEnGrados = Math.toDegrees(anguloEnRadianes);
		System.out.println("Arco seno de: " + valorIngresado + "=" + anguloEnGrados + "º");
		
		anguloEnRadianes = Math.atan(valorIngresado);
		anguloEnGrados = Math.toDegrees(anguloEnRadianes);
		System.out.println("Arco tangente de: " + valorIngresado + "=" + anguloEnGrados + "º");
		
	}

}
