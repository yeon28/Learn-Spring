package p021.bean.basic;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/* 
 * */	
public class TVUser {
	
	public static void main(String[] args) {

		// applicationContext.xml에 있는 <bean>들을 찾아서 spring이 new로 인스턴스 생성함.
		AbstractApplicationContext factory 
						//applicationContext.xml 읽어옮.
					= new GenericXmlApplicationContext("applicationContext.xml");
		
		/* spring에서 <bean>을 생성할 때 사용하는 대표적 class들
		 * 1) GenericXmlApplicationContext 
		 * 		: 자바 코드 내에서 직접 class를 사용하여 bean(인스턴스)을 생성함.
		 * 2) XmlWebApplicationContext 
		 * 		: spring이 자동으로 서블릿 등 class들을 bean(인스턴스)을 생성함.
		 * 		=> 일반 개발자가 사용할 수 없는 클래스
		 *  */
		
		// => applicationContext.xml에 있는 id가  tv인 <bean>을 찾아서 spring이 new로 인스턴스 생성함.
		TV tv = (TV) factory.getBean("samsung");
		
		tv.powerOn();
		tv.volUp();
		tv.volDown();
		tv.powerOff();
		
		
		tv = (TV) factory.getBean("lg");
		
		tv.powerOn();
		tv.volUp();
		tv.volDown();
		tv.powerOff();
		
		
	}
}
