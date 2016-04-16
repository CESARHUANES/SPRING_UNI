package pe.egcc.demo03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PruebaA {
public static void main(String[] args) {
//levantando el contexto
String fileXML="/pe/egcc/demo03/demo03.xml";
BeanFactory bf;
bf=new ClassPathXmlApplicationContext(fileXML);
//Acceso al objeto
Math bean;
bean=bf.getBean(Math.class);//busca en el contexto la instancia de esta clase
System.out.print("7+3=" +bean.sumar(7, 3));
	
}
}
