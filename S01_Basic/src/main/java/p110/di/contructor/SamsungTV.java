package p110.di.contructor;

public class SamsungTV implements TV {

	private SonySpeaker Speaker;
		
	
	public SamsungTV() {
		System.out.println("1. SamsungTV 객체 생성");
	}
	
	public SamsungTV(SonySpeaker speaker) {
		System.out.println("1. SamsungTV 객체 생성");
		this.Speaker = speaker;
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
		this.Speaker.volUp();
	}

	@Override
	public void volDown() {
		this.Speaker.volDown();
	}
	
	
	
	

	
}
