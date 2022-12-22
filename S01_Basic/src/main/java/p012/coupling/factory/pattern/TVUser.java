package p012.coupling.factory.pattern;

/* 
 * */	
public class TVUser {
	
	public static void main(String[] args) {
//		System.out.println(args[0]);
		
		BeanFactory factory = new BeanFactory();
		TV tv = (TV) factory.getBean(args[0]);
		
		tv.powerOn();
		tv.volUp();
		tv.volDown();
		tv.powerOff();
		
	}
}
