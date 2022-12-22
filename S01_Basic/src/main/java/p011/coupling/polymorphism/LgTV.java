package p011.coupling.polymorphism;

public class LgTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("LgTV--> 전원을 켠다");

	}

	@Override
	public void powerOff() {
		System.out.println("LgTV--> 전원을 끈다");

	}

	@Override
	public void volUp() {
		System.out.println("LgTV--> 소리를 높임");
	}

	@Override
	public void volDown() {
		System.out.println("LgTV--> 소리를 줄임");
	}

}
