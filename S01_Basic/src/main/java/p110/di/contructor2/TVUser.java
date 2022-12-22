package p110.di.contructor2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/* 
 * */	
public class TVUser {
	
	public static void main(String[] args) {

		AbstractApplicationContext factory 
					= new GenericXmlApplicationContext("applicationContext110m.xml");
		
		TV tv = (TV) factory.getBean("tv");
		
		tv.powerOn();
		tv.volUp();
		tv.volDown();
		tv.powerOff();
		
		factory.close();
		
	}
}
