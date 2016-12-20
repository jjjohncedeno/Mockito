package objetos;

import interfaces.Validacion;

public class Customer implements Validacion{
	private int edad;
	private String nombre;
	private String cedula;
	public Customer(int edad, String nombre, String cedula) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.cedula = cedula;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	@Override
	public Boolean isAdult() {
		if (this.edad < 18){
			return false;	
		}else{
			return true;
		}
	}
	
	
}
