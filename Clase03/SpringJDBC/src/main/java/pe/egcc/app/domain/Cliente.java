package pe.egcc.app.domain;

public class Cliente {
private String	codigo;
private String	paterno;
private String	materno;
private String	nombre;
private String	dni;
private String	telefono;
private String	direccion;
private String	email;
private String ciudad;
public String getCodigo() {
	return codigo;
}
public void setCodigo(String codigo) {
	this.codigo = codigo;
}
public String getPaterno() {
	return paterno;
}
public void setPaterno(String paterno) {
	this.paterno = paterno;
}
public String getMaterno() {
	return materno;
}
public void setMaterno(String materno) {
	this.materno = materno;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCiudad() {
	return ciudad;
}
public void setCiudad(String ciudad) {
	this.ciudad = ciudad;
}

public Cliente()
{
	
}
}
