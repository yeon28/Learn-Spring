package p023.bean.properties2;

/*
 * Spring에서는 class를 생성할 때 , default 생성자는 반드시 생성하는 것을 권장함.
 * -> spring 때문에.
 */
public class SamsungTV implements TV {

	public SamsungTV() {
		System.out.println("1. SamsungTV 객체 생성");
	}
	
	public void initMethod() {
		System.out.println("2. 객체 초기화 작업 수행");
	}
	
	public void destroyMethod() {
		System.out.println("End. 객체 삭제 전 처리할  작업 수행");
	}
	
	@Override
	public void powerOn() {
		System.out.println("samsungTV--> 전원을 켠다");

	}

	@Override
	public void powerOff() {
		System.out.println("samsungTV--> 전원을 끈다");

	}

	@Override
	public void volUp() {
		System.out.println("samsungTV--> 소리를 높임");
	}

	@Override
	public void volDown() {
		System.out.println("samsungTV--> 소리를 줄임");
	}

}
