package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		/*
		//Creacion de objetos de tipo empleados
		Empleados Empleado1 = new directorEmpleado();
		
		
		//Uso de los objetos creados
		System.out.println(Empleado1.getTareas());
		*/
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		 Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
		 System.out.println(Juan.getTareas());
		 contexto.close();
		 
		 
		 
	}
}
