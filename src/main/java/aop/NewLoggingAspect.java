package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: a try to return book to the Library");

        long begin = System.currentTimeMillis();
        Object targetMethodResult = proceedingJoinPoint.proceed();
//        targetMethodResult = "Harry Potter";
        long end = System.currentTimeMillis();

        System.out.println("aroundReturnBookLoggingAdvice: book is returned successfully to the Library");
        System.out.println("aroundReturnBookLoggingAdvice: method returnBook time execution " + (end-begin) + " ms.");
        return targetMethodResult;
    }
}
