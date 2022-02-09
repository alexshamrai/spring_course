package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPoincuts {

    @Pointcut("execution(* get*())")
    public void allGetMethods(){};
}
