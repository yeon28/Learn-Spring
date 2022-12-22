package p401.di.annotation;

// interface는 기본적으로 인스턴스를 자동 생성하는  @Component annotation 사용 불가함.
public interface Speaker {
	void volUp();
	void volDown();
}
