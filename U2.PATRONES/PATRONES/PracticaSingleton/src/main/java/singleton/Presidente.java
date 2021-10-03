package singleton;

public class Presidente {
	private String nombre;
	private String apellidos;
	private int anoDeLaEleccion;
	private static Presidente presidente = null;
	
	private Presidente(String nombre, String apellidos, int anoDeLaEleccion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.anoDeLaEleccion = anoDeLaEleccion;
	}
	
	public static Presidente getPresidente(String nombre,String apellidos,int anoDeLaEleccion) {
		if (presidente == null) {
			presidente = new Presidente(nombre, apellidos, anoDeLaEleccion);
		}
		return presidente;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getAnoDeLaEleccion() {
		return anoDeLaEleccion;
	}
	public void setAnoDeLaEleccion(int anoDeLaEleccion) {
		this.anoDeLaEleccion = anoDeLaEleccion;
	}
	
	@Override
	public String toString() {
		return "Presidente [nombre=" + nombre + ", apellidos=" + apellidos + ", anoDeLaEleccion=" + anoDeLaEleccion
				+ "]";
	}
	
	   
}
