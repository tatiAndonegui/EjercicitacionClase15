package clase15;

public class Editorial {

	private String nombre, direccion, localidad,email;
	private int telefono,cuit;
	
	
	//constructor
	public Editorial(String nombre, String direccion, String localidad, String email, int telefono, int cuit) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.localidad = localidad;
		this.email = email;
		this.telefono = telefono;
		this.cuit = cuit;
	}
	
	//creacion por suorce de getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public int getCuit() {
		return cuit;
	}
	public void setCuit(int cuit) {
		this.cuit = cuit;
	}

	//metodo to string 
	@Override
	public String toString() {
		return "Editorial [nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", email="
				+ email + ", telefono=" + telefono + ", cuit=" + cuit + "]";
	}
	
	
	
}
