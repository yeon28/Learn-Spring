package p304.di.collection.properties;

import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {
	public static void main(String[] args) {

		AbstractApplicationContext factory 
				= new GenericXmlApplicationContext("applicationContext304.xml");
		
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
		Properties addrList = bean.getAddrList();
		
		Set<String> keys = addrList.stringPropertyNames();
		
		for (String key : keys) {
			System.out.println("key : " + key + "\t| value : " + addrList.getProperty(key));
		}
		
		factory.close();
	}
}
