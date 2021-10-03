package factory;

public class FiguraFactory {
	public static Figura devuelveFigura(String tipo) {

		if (tipo.equals("Triangulo")) {
			return new Triangulo("Triangulo");
		} else if (tipo.equals("Circulo")) {
			return new Circulo("Circulo");
		} else if(tipo.equals("Cuadrado")){
			return new Cuadrado("Cuadrado");
		}else {
			return new Rectangulo("Rectangulo");
		}
	}
}
