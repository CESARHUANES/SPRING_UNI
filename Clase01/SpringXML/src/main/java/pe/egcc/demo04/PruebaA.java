package pe.egcc.demo04;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PruebaA {
public static void main(String[] args) {
//levantando el contexto
String fileXML="/pe/egcc/demo04/demo04.xml";
BeanFactory bf;
bf=new ClassPathXmlApplicationContext(fileXML);
//Acceso al objeto
IMath bean;
bean=bf.getBean(IMath.class);//busca en el contexto la instancia de esta clase
System.out.print("7+3=" +bean.sumar(7, 3));
	
}
}
