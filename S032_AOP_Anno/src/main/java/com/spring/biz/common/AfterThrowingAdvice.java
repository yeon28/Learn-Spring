package com.spring.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AfterThrowingAdvice {

	private void exceptionLog() {
		System.out.println("[예외 처리] 비지니스 로직 수행 중 예외 발생");
	}
	
	@AfterThrowing(pointcut = "PointcutCommon.allPointCut()", throwing = "exceptObj")
	private void exceptionLog2(JoinPoint jp, Exception exceptObj) {
		System.out.println("--> AfterThrowingAdvice exceptionLog2() 실행");
		
		String method = jp.getSignature().getName();

		System.out.println("[예외 처리] " + method + "() ---> 메소드 수행중 발생된 예외 메시지 : " + exceptObj.getMessage());
	
		if (exceptObj instanceof IllegalAccessException) {
			System.out.println("부적절한 값이 입력됨.");
		}else if (exceptObj instanceof NumberFormatException) {
			System.out.println("부적절한 값이 입력됨. -> 숫자 형식 값이 아님.");
		}else if (exceptObj instanceof Exception) {
			System.out.println("문제 발생");
		}
	}
}
