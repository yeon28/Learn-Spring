package com.spring.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

import com.spring.biz.user.UserVO;

@Service
@Aspect
public class AfterReturningAdvice {
	
	public void afterLog() {
		System.out.println("[사후 처리] 비지니스 로직 수행 후 동작");
	}

	@AfterReturning(pointcut = "getPointCut()", returning = "returnObj")
	public void afterLog2(JoinPoint jp, Object returnObj) {
		System.out.println("--> AfterReturningAdvice afterLog2() 실행");
		
		String method = jp.getSignature().getName();

		if (returnObj instanceof UserVO) {
			UserVO vo = (UserVO) returnObj;
			if (vo.getRole().equals("admin")) {
				System.out.println(vo.getName() + " 로그인(admin)");
			}
		}
		System.out.println("[사후 처리] " + method + "() --> 메소드 리턴값 : " + returnObj.toString());
	}
}
