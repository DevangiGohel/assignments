package com.aimdek;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Display {

	public static void main(String[] args) {
			@SuppressWarnings("resource")
			ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
			model model = (model) context.getBean("bean2");

			model.setName("Payal Jadav");

			model model2 = (model) context.getBean("bean2");
			
			model2.setName("Dhruvisha");
			
			model.getName();
			model2.getName();
			

		}
}
