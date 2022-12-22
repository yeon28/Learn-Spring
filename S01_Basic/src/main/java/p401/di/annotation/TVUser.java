package p401.di.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class TVUser {
	
	public static void main(String[] args) {

		
		/* 
		 applicationContext401.xml에서
		 1. <context:component-scan>를 사용해 bean으로 자동 생성한 package를 지정함.
		 	=> base-package="p401.di.annotation"로 지정함, 해당 package에 있는 class로 bean으로 spring이 자동 생성함.
		 		- spring은  p401.di.annotation 패키지 안에 있는 @Component로  annotation
		  */	
		AbstractApplicationContext factory 
					= new GenericXmlApplicationContext("applicationContext401.xml");
		
		// .getBean("tv")	: @Component 중에서 id가 "tv"인  bean을 가져오라는 의미.
//		TV tv = (TV) factory.getBean("samsung");
		TV tv = (TV) factory.getBean("lg");
		
		tv.powerOn();
		tv.volUp();
		tv.volDown();
		tv.powerOff();
		
		factory.close();
		
	}
}
