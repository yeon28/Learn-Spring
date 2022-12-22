package p401.di.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("samsung") // "samsung" => 인스턴스로 생성될 bean의 id
public class SamsungTV implements TV {
	
	@Autowired	// SamsungTV에  class에 Speaker로 생성된 인스턴스를 setter하라는 의미.
	@Qualifier("sony")
	private Speaker speaker;

	public SamsungTV() {
		System.out.println("1. SamsungTV 객체 생성");
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
		this.speaker.volUp();
	}

	@Override
	public void volDown() {
		this.speaker.volDown();
	}

}
