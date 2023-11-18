package com.example.designpattern.StructuralPattern.ProxyPattern.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 获取代理对象的工厂类
 */
public class ProxyFactory {

    //声明目标对象
    private TrainStation station = new TrainStation();

    public SellTickets getProxyInstance() {
        //返回代理对象即可
        /*参数 类加载器 勇于加载代理类，可以通过目标对象获取类加载器
        *      代理类实现的接口的字节码对象
        *      代理类对象调用处理程序 即代理对象*/
        return (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    /*参数 proxy 代理对象 等同于 station 在invoke方法中基本不用
                    *      method 对接口方法进行封装的方法，此处对应的就是sell()
                    *      args  方法传入的参数
                    *       return 的返回值就是方法的返回值
                    */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("invoke方法执行");
                        System.out.println("代售点收取一定的的费用（JDK动态代理）");
                        Object obj = method.invoke(station, args);
                        return obj;
                    }
                }
        );
    }

}
