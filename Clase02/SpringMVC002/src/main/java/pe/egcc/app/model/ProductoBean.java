package pe.egcc.app.model;

public class ProductoBean {
private String nombre;
private double precio;
public ProductoBean(){
	
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
private int stock;
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}

}
