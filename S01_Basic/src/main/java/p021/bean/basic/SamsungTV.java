package p021.bean.basic;

public class SamsungTV implements TV {

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
