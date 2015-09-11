package fr.cap.wikimnv.contribution.aspect;

import java.util.Calendar;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.cap.wikimnv.exception.MNVException;

public class LoggerMNV {

	Logger logger = LoggerFactory.getLogger(LoggerMNV.class);
	
	public void logEvent(JoinPoint joinPoint){
		logger.info(joinPoint.getThis().getClass().getSimpleName(), joinPoint.getArgs().length);
	}
	
	public Object logProcess(ProceedingJoinPoint joinPoint){
		Object returnValue = null;
		try {
			logger.info(Calendar.getInstance().getTimeInMillis() + " - Start " + joinPoint.getSignature().toString());
			returnValue = joinPoint.proceed();
			logger.info(Calendar.getInstance().getTimeInMillis() + " - End " + joinPoint.getSignature().toString());
		} catch (MNVException e){	
			logger.debug(e.getCodeErreur() + " : " + e.getMessage());
		} catch (Throwable e) {
			logger.debug("Erreur non traitée" + " : " + joinPoint.getSignature().toString() + " - " + e.getMessage());
		}
		return returnValue;
	}
}
