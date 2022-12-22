package p110.di.contructor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/* 
 * */	
public class TVUser {
	
	public static void main(String[] args) {

//		SonySpeaker speaker = new SonySpeaker();
//		TV tv1 = new SamsungTV();
		
		/* 
		 IOC에서 constructor를 사용한 dependency injection 사용
		 */ 
		AbstractApplicationContext factory 
					= new GenericXmlApplicationContext("applicationContext110.xml");
		
		TV tv = (TV) factory.getBean("tv");
		
		tv.powerOn();
		tv.volUp();
		tv.volDown();
		tv.powerOff();
		
		factory.close();
		
	}
}
