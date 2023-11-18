package com.example.designpattern.StructuralPattern.ProxyPattern.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 测试cglib能不能对接口代理
 */
public class ProxyFactory2 implements MethodInterceptor {

    TrainStation2 station = new TrainStation2();

    public TrainStation2 getStation() {
        return (TrainStation2) Enhancer.create(TrainStation2.class ,station.getClass().getInterfaces(),this);
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object obj = method.invoke(station, objects);
        return obj;
    }
}
