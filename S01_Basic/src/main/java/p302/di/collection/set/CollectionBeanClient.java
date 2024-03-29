package p302.di.collection.set;

import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {
	public static void main(String[] args) {

		AbstractApplicationContext factory 
				= new GenericXmlApplicationContext("applicationContext302.xml");
		
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
		Set<String> addrList = bean.getAddrList();
		
		for (String addr : addrList) {
			System.out.println(addr);
		}
		
		factory.close();
	}
}
