package com.app.S2S.security;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.dao.DataAccessException;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;

@Aspect
public class AopAspact {
	private static final Logger logger=Logger.getLogger(AopAspact.class);
//	 @AfterThrowing("within(com.app.tournamentRecords..*)") 
//	 public void myadvice(JoinPoint jp,Throwable error)//it is advice  
//   {  
//		 System.out.println("additional concern......................"+jp.getSignature().getName());  
// 
//   }  
	
@Before("execution(* com.app.S2S..*.*(..))")
public void beforExample(JoinPoint jp){
	
	//System.out.println("------------------------------"+jp.getSignature().getName());
}
@AfterThrowing(
	      pointcut = "execution(* com.app.S2S..*.*(..))",
	      throwing= "error")
	    public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {

		//System.out.println("logAfterThrowing() is running!");
	 logger.info("hijacked  Exception in This Method: " + joinPoint.getSignature().getName());
	 logger.error("Exception : " + error);
	 logger.info("*************************************S2S_Exeption_logger.info*****************************************************");

	    }
	//@Pointcut("@annotation(Service)") this might still work, but try 'within' instead
//	@Pointcut("@within(Service)") //this should work for the annotation service pointcut
//	private void inTrading() {}
//
//	@Pointcut("anyPublicOperation() && inTrading()")
//	private void tradingOperation() {}
//	 @Before("anyPublicOperation()") 
//	 public void myadviceaaa(JoinPoint joinPoint)//it is advice  
//   {  
//			    logger.info("###### Requested class : {} ; Method : {} "+ joinPoint.getTarget().getClass().getName()+ joinPoint.getSignature().getName());
//			    Object[] signatureArgs = joinPoint.getArgs();
//			    for (Object signatureArg : signatureArgs) {
//			        logger.info("###### Arguments: {} "+ signatureArg.toString());
//			    }
//			    
//   } 
//	 @After("anyPublicOperation()") 
//	 public void myadviceafter(JoinPoint jp)//it is advice  
//   {  
//       logger.info("additional concern......................"+jp.getSignature().getName());  
//       //logger.info("Exception is: "+error);  
//       logger.info("end of after throwing advice...");  
//   }
}
	


