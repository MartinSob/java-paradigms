/*
 * (c) 2003-2016 MuleSoft, Inc. This software is protected under international copyright law. All use of this software is subject to
 * MuleSoft's Master Subscription Agreement (or other Terms of Service) separately entered into between you and MuleSoft. If such an
 * agreement is not in place, you may not use the software.
 */
package ar.edu.uai.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* ar.edu.uai.service.PersonService.insert(..))")
    public void auditDatabase(JoinPoint joinPoint) {
        Logger LOGGER = LoggerFactory.getLogger(joinPoint.getTarget().getClass());
        LOGGER.info("About to save into database with parameters: {" + StringUtils.arrayToCommaDelimitedString(joinPoint.getArgs()) + "}");
    }
}
