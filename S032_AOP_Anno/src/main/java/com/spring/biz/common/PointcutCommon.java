package com.spring.biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutCommon {

	@Pointcut("execution(* com.spring.biz..*Impl.*(..))")
	private void allPointCut() {	}
	
	@Pointcut("execution(* com.spring.biz..*Impl.get*(..))")
	private void getPointCut() {	}
	
	
}
