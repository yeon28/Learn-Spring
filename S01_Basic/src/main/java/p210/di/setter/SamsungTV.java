package p210.di.setter;

public class SamsungTV implements TV {

	private Speaker speaker;
	private int price;

	public SamsungTV() {
		System.out.println("1. SamsungTV 객체 생성");
	}

	public SamsungTV(Speaker speaker) {
		System.out.println("1. SamsungTV 객체 생성");
		this.speaker = speaker;
	}

	public SamsungTV(Speaker speaker, int price) {
		System.out.println("1. SamsungTV 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}

	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() 호출");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("===> setPrice() 호출");
		this.price = price;
	}

	@Override
	public void powerOn() {
		System.out.println("samsungTV--> 전원을 켠다");
		System.out.println("price : " + this.price);

	}

	@Override
	public void powerOff() {
		System.out.println("samsungTV--> 전원을 끈다");

	}

	@Override
	public void volUp() {
		this.speaker.volUp();
	}

	@Override
	public void volDown() {
		this.speaker.volDown();
	}

}
