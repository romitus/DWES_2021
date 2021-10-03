package factory;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura figura = FiguraFactory.devuelveFigura("Rectangulo");
		System.out.println(figura.dibujarFigura());
	}

}
