package com.milan.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 * Application Lifecycle Listener implementation class MyServletContextAttributeListener
 *
 */
public class MyServletContextAttributeListener implements ServletContextAttributeListener {

    /**
     * Default constructor. 
     */
    public MyServletContextAttributeListener() {

    }

	/**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     */
    public void attributeAdded(ServletContextAttributeEvent arg0)  { 
         System.out.println("attributeAdded...");
         System.out.println("attributeAdded..."+arg0.getName());
         System.out.println("attributeAdded..."+arg0.getValue());
         }

	/**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    public void attributeRemoved(ServletContextAttributeEvent arg0)  { 
    	System.out.println("attributeRemoved。。。"+arg0.getName());
    }

	/**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    public void attributeReplaced(ServletContextAttributeEvent arg0)  { 
    	System.out.println("attributeReplaced..."+arg0.getName());
    }
	
}
