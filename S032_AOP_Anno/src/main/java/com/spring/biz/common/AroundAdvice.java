package com.spring.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

@Service
@Aspect
public class AroundAdvice {

	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {

		System.out.println("[BEFORE] 비지니스 메소드 수행 전에 처리할 내용");
		// proceed : 원래 매소드의 내용의 실행하라는 method
		Object returnObj = pjp.proceed();
		System.out.println("[AFTER] 비지니스 메소드 수행 후에 처리할 내용");

		return returnObj;
	}

	@Around("PointcutCommon.allPointCut()")
	public Object aroundLog2(ProceedingJoinPoint pjp) throws Throwable {

		System.out.println("--> AroundAdvice aroundLog2() 실행");

		String method = pjp.getSignature().getName();

		StopWatch stopWatch = new StopWatch();

		stopWatch.start();
		Object object = pjp.proceed();
		stopWatch.stop();

		System.out.println(method + "() 메소드 수행에 걸린 시간 : " + stopWatch.getTotalTimeMillis() + "(ms)초 ");
		return object;
	}
}
