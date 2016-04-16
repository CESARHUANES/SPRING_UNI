package pe.egcc.demo06;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PruebaA {
public static void main(String[] args) {
//levantando el contexto
String fileXML="/pe/egcc/demo06/demo06.xml";
BeanFactory bf;
bf=new ClassPathXmlApplicationContext(fileXML);
//Acceso al objeto
Control bean;
bean=bf.getBean(Control.class);//busca en el contexto la instancia de esta clase
System.out.print("7+3=" +bean.sumar(7, 3));
System.out.print("Nombre :=" +bean.getNombre());
System.out.print("Ciudad :=" +bean.getCiudad());
	
}
}
