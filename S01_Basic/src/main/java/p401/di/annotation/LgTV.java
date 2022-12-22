package p401.di.annotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("lg") // "lg" => 인스턴스로 생성될 bean의 id
public class LgTV implements TV {
	
	@Autowired
	@Qualifier("apple")
//	@Resource(name = "apple") // => @Autowired + @Qualifier("apple")
	private Speaker speaker;
	
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
		this.speaker.volUp();
	}

	@Override
	public void volDown() {
		this.speaker.volDown();
	}

}
