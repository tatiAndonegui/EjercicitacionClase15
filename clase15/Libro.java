package clase15;

public class Libro {

	private String nombre,a�o;
	private int cantidad,costo;
	private Editorial editorial;
	private Autor autor;
	
	
	
	public Libro(String nombre, String a�o, int cantidad, int costo, Editorial editorial, Autor autor) {
		super();
		this.nombre = nombre;
		this.a�o = a�o;
		this.cantidad = cantidad;
		this.costo = costo;
		this.editorial = editorial;
		this.autor = autor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getA�o() {
		return a�o;
	}
	public void setA�o(String a�o) {
		this.a�o = a�o;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}
	public Editorial getEditorial() {
		return editorial;
	}
	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", a�o=" + a�o + ", cantidad=" + cantidad + ", costo=" + costo
				+ ",\n editorial=" + editorial + ",\n autor=" + autor + "]";
	}
	
	
	
}
