package com.weather.weatherfcst.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.weather.weatherfcst.*(..))")
    public void logBeforeMethod(JoinPoint joinPoint) {
        logger.info("Method called: " + joinPoint.getSignature());
    }
}
