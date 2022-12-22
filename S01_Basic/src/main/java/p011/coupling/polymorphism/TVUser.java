package p011.coupling.polymorphism;

public class TVUser {
	public static void main(String[] args) {
		
		//-- 삼성tv
//		SamsungTV tv = new SamsungTV();
		
		//-- 엘지tv 
		LgTV tv = new LgTV();
		
		tv.powerOn();
		tv.volUp();
		tv.volDown();
		tv.powerOff();
		
/* - 폴리모피즘에 의해서 class를 변경할 경우 재코딩하는 양이 획기적으로 줄어듦.	
 * 		단점 : class를 교체할 때, 소스코드를 수정해야함.
 * */	
	}
}
