package pe.egcc.demo02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class PruebaA {
	
	@SuppressWarnings("resources")
public static void main(String[] args) {
		//levantando el contexto
		String fileXML="/pe/egcc/demo02/demo02.xml";
		BeanFactory bf;
		bf=new ClassPathXmlApplicationContext(fileXML);
		//Acceso al objeto
		Math bean;
		bean=bf.getBean(Math.class);//busca en el contexto la instancia de esta clase
		System.out.print("7+3=" +bean.sumar(7, 3));
		
}

}
