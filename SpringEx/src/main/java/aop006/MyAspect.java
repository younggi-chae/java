package aop006;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	@Pointcut("execution(* runSomething())")
	private void iampc() {}
	
	@Before("iampc()")
	public void before(JoinPoint joinpoint) {
		System.out.println("얼굴 인식 확인 : 문을 개방하라");
	
	}

	@After("iampc()")
	public void lockDoor(JoinPoint joinpoint) {
		System.out.println("주인님 나갔다: 문 잠가!");
		
	}

}
