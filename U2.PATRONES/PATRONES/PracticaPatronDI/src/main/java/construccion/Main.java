package construccion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tejado t1 = new Tejado();
		Tejado t2 = new Tejado();
		Pared p1 = new Pared(2.5);
		Pared p2 = new Pared(2.5);
		Pared p3 = new Pared(2.5);
		Pared p4 = new Pared(2.5);
		Pared p5 = new Pared(3);
		Pared p6 = new Pared(3);
		Pared p7 = new Pared(3);
		Pared p8 = new Pared(3);

		Casa c1 = new Casa(125, t1, p1, p2, p3, p4);
		Casa c2 = new Casa(250, t2, p5, p6, p7, p8);

		c1.getTejado().darsoporte();
		c2.getTejado().darsoporte();

		System.out.println(c1.toString());
		System.out.println(c2.toString());

	}

}
