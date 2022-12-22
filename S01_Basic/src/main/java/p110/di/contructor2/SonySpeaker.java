package p110.di.contructor2;

public class SonySpeaker {
	
	public SonySpeaker() {
		System.out.println("--> SonySpeaker 객체 생성");
	}
	
	public void volUp() {
		System.out.println("SonySpeaker --> 볼륨을 올린다.");
	}
	public void volDown() {
		System.out.println("SonySpeaker --> 볼륨을 내린다.");
	}
	
}
