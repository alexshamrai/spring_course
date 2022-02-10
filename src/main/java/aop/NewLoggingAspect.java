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

        Object targetMethodResult = null;
        try {
             targetMethodResult = proceedingJoinPoint.proceed();
        }
        catch (Exception e) {
            System.out.println("aroundReturnBookLoggingAdvice: exception was logged " + e);
            throw e;
        }

        System.out.println("aroundReturnBookLoggingAdvice: book is returned successfully to the Library");
        return targetMethodResult;
    }
}
