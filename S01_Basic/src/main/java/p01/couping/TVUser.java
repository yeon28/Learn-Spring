package p01.couping;

public class TVUser {
	public static void main(String[] args) {
		
//		SamsungTV tv = new SamsungTV();
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
		
		LgTV tv = new LgTV();
		tv.turnOn();
		tv.soundUP();
		tv.soundDown();
		tv.turnOff();
		
/*--> 큰 문제 발생 : SamsungTV로 코딩하다기 LgTV를 사용하여 코딩함.
 * 		=> coupling : 결합응집도
 * 		- 삼성tv와 엘지tv를 tvUser에서 사용할 때, 
 * */
		
	}
}
