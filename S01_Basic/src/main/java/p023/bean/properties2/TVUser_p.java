package p023.bean.properties2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/* 
 * */
public class TVUser_p {

	public static void main(String[] args) {

		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext023p.xml");

		TV tv = (TV) factory.getBean("tv");

		/* applicationContext023p.xml의 <bean>에서 scope을 prototype으로 설정하면,
		 * getBean할 때마다 새로운 인스턴스를 생성함.
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
