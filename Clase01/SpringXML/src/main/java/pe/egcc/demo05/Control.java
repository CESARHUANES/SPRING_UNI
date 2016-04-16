package pe.egcc.demo05;

public class Control {

private Math math;
private String nombre;


 public void setMath(Math math) {
	this.math = math;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int sumar(int n1,int n2){
	return math.sumar(n1, n2);
}


public String getNombre() {
	return nombre;
}


}
