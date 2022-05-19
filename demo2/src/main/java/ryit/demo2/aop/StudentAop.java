package ryit.demo2.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class StudentAop {

    @Pointcut("execution(public * ryit.demo2.controller.*.*(..))")
    public void studentPointCut(){}

    @Before("studentPointCut()")
    public void studentBefore(JoinPoint joinPoint){
      log.info("method执行前打印了{}",joinPoint.getArgs());
    }

    @After("studentPointCut()")
    public void studentAfter(JoinPoint joinPoint){
        log.info("after执行前打印了{}",joinPoint.getTarget());
    }
}
