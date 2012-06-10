package kz.sdu.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import kz.sdu.entities.City;


public class TestListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("Executing entites: ");
		
		City city=new City();
		
		city.setName("Astana");
		
		
		System.out.println("Done");
		
	}

}
