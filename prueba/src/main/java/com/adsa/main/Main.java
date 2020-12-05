package com.adsa.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		Resource recurso = new ClassPathResource("springconfig.xml");
		BeanFactory factory = new XmlBeanFactory(recurso);
		
		Persona persona = (Persona)factory.getBean("persona");
		
		System.out.println("hola");
		
		persona.mostrarEstudianteActual();

	}

}
