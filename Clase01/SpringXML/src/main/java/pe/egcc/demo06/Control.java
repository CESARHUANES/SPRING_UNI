package pe.egcc.demo06;

public class Control {

private Math math;
private String nombre;
private String ciudad;




public int sumar(int n1,int n2){
	return math.sumar(n1, n2);
}


public Control(Math math, String nombre, String ciudad) {
	super();
	this.math = math;
	this.nombre = nombre;
	this.ciudad = ciudad;
}


public String getNombre() {
	return nombre;
}


public String getCiudad() {
	return ciudad;
}



}
