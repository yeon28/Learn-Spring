package p301.di.collection.list;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {
	public static void main(String[] args) {

		AbstractApplicationContext factory 
				= new GenericXmlApplicationContext("applicationContext301.xml");
		
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
		List<String> addrList = bean.getAddrList();
		
		for (String addr : addrList) {
			System.out.println(addr);
		}
		
		factory.close();
	}
}
