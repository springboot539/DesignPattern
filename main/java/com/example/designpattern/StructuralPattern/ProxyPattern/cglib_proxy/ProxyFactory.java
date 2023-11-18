package com.example.designpattern.StructuralPattern.ProxyPattern.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 工厂类，cglib实际代理类是在内存中生成的
 */
public class ProxyFactory implements MethodInterceptor {

    TrainStation station = new TrainStation();

    public TrainStation getStation() {
        /*
        * 类似于JDK动态代理，只不过JDK是需要定义接口，并对接口进行处理
        * cglib是对JDK动态代理的补充，不需要接口
        * 实际上生成的是真实类的子类
        * 设置superclass字节码
        * 设置callback类属于JDK的invocationHandler
        * */
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TrainStation.class);
        enhancer.setCallback(this);
        return (TrainStation) enhancer.create();
    }

    /*
    * 方法参数和JDK动态代理相同， 使用反射调用真实类的方法，object数组是参数，
    * 最后return的是返回值，如果没有返回值自己返回一个Object即可
    *     * */
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("增加cglib动态代理---");
        Object obj = method.invoke(station, objects);
        return obj;
    }
}
