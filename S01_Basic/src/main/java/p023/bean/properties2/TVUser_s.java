package p023.bean.properties2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/* 
 * */
public class TVUser_s {

	public static void main(String[] args) {

		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext023s.xml");

		// Dependency Lookup 방식으로 bean(인스턴스)을 가져옴
		TV tv = (TV) factory.getBean("tv");

		/*
		 * getBean으로 새로운 인스턴스를 생성해주는 것이 아니라, 기존에 생성된 인스턴스를 넘겨줌.(Singleton design pattern) 
		 * - applicationContext023p.xml의 태그에서 scope의 기본 값은 singleton임.
		 * - spring의 기본 철학은 동일한 class의 인스턴스를 가능하면 1개로 사용하는 것을 권장함.
		 */
		TV tv2 = (TV) factory.getBean("tv");

		if (tv == tv2) {
			System.out.println("tv와 tv2는 같은 객체");
		} else {
			System.out.println("tv와 tv2는 다른 객체");

		}

		tv.powerOn();
		tv.volUp();
		tv.volDown();
		tv.powerOff();

		factory.close();

	}
}
