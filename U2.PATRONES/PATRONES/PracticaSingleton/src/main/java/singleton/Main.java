package singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Presidente p1 = Presidente.getPresidente("Antonio", "Garcia", 2016);
		Presidente p2 = Presidente.getPresidente("Jose", "Muñoz", 2010);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.equals(p2));
	}

}
