package pe.egcc.demo03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class PruebaA {
	
	@SuppressWarnings("resources")
public static void main(String[] args) {
		//levantando el contexto
		String fileXML="/pe/egcc/demo04/demo04.xml";
		BeanFactory bf;
		bf=new ClassPathXmlApplicationContext(fileXML);
		//Acceso al objeto
		Control bean;
		bean=bf.getBean(Control.class);//busca en el contexto la instancia de esta clase
		System.out.print("7+3=" +bean.sumar(7, 3));
		
}

}
