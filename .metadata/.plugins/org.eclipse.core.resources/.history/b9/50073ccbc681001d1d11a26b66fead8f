package com.spring.biz.common;

import org.aspectj.lang.JoinPoint;

import com.spring.biz.user.UserVO;

public class AfterReturningAdvice {

	public void afterLog() {
		System.out.println("[사후 처리] 비지니스 로직 수행 후 동작");
	}

	// xml에서  returning 된 속성으로 지정된 것을 2번째 parm으로 넘기라는 의미.
	public void afterLog2(JoinPoint jp, Object returnObj) {
		String method = jp.getSignature().getName();

		if (returnObj instanceof UserVO) {
			UserVO vo = (UserVO) returnObj;
			if (vo.getRole().equals("admin")) {
				System.out.println(vo.getName() + "--> 로그인(admin)");
			}
		}
		System.out.println("[사후 처리] " + method + "() --> 메소드 리턴값 : " + returnObj.toString());
	}
}
