package p401.di.annotation;

import org.springframework.stereotype.Component;

@Component("sony")
public class SonySpeaker implements Speaker {
	
	public SonySpeaker() {
		System.out.println("--> SonySpeaker 객체 생성");
	}
	
	@Override
	public void volUp() {
		System.out.println("SonySpeaker --> 볼륨을 올린다.");
	}
	
	@Override
	public void volDown() {
		System.out.println("SonySpeaker --> 볼륨을 내린다.");
	}
	
}
