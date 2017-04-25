package com.milan.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class MyServletContextListener
 *
 */
public class MyServletContextListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public MyServletContextListener() {
      
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
    	System.out.println("contextDestroyed...");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
    	System.out.println("contextInitialized...");
    }
	
}
