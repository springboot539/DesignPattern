#代理模式
需要给某对象提供一个以控制该对象的访问   
 -优点：起到中介作用，对目标对象保护，扩展目标对象的方法，将客户端和目标对象分离，降低系统耦合度  
 -缺点：增加复杂度  
-场景：远程代理（RPC思想）（本地服务通过网络请求远程服务，将网络通信部份隐藏，只暴露给本地服务一个接口，通过接口访问远程服务，而不关心通信的细节）  
-防火墙（浏览器配置VPN成代理功能时，防火墙将浏览器请求转发给互联网，互联网响应时，代理服务器再将它转给浏览器）
-保护代理（控制一个对象的访问，如给不同的用户提供不同级别的使用权限）

##Java中代理按照代理类生成时机不同分为静态代理和动态代理。
    静态代理类在编译期就生成，  
    动态代理类则是在Java运行时动态生成。
        动态代理分为JDK代理和CGLIB代理。

###静态代理就是直接增加一层
###JDK提供的动态代理：  
Java提供了动态代理类Proxy，但是Proxy并不是代理对象的类，而是提供了一个创建代理对象的静态方法（newproxyInstance）来获取代理对象
JDK动态代理真的厉害，不直接使用方法，只创建ProxyFactory，提供被代理对象（new出来一个）
提供一个getProxyInstance（）返回代理类
```
//声明目标对象
    private TrainStation station = new TrainStation();

    public SellTickets getProxyInstance() { 
      //返回代理对象即可
        /*
            参数 类加载器 勇于加载代理类，可以通过目标对象获取类加载器
        *      代理类实现的接口的字节码对象
        *      代理类对象调用处理程序 即代理对象
        */
    return (SellTickets) Proxy.newProxyInstance(
station.getClass().getClassLoader(),
station.getClass().getInterfaces(),
new InvocationHandler() {
/*参数 
    proxy 代理对象 等同于 station 在invoke方法中基本不用
*      method 对接口方法进行封装的方法，此处对应的就是sell()
*      args  方法传入的参数
*       return 的返回值就是方法的返回值
*/
@Override
public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
System.out.println("invoke方法执行");
System.out.println("代售点收取一定的的费用（JDK动态代理）");
//若方法没有返回值，就直接返回Object对象即可
Object obj = method.invoke(station, args);
return obj;
}
}
```
**注意上面这个是工厂类并不是代理类，代理类是在程序运行过程中动态的在内存中生成的类**
内存中生成的代理类，和真实类（火车站售票）同样的接口SellTicktes,并且将提供的匿名内部类传递给了父类  
---
流程：
1.测试类调用接口中的方法Sell()  
2.根据多态特性，执行（内存中生成的）代理类中的sell()方法
3.（内存中生成的）代理类调用invocationHandler接口的子实现类对象（匿名内部类）的invoke方法
4.invoke方法通过反射执行真实对象（火车站）所属类中的sell()方法
---
###CGLIB动态代理
如果没有定义SellTickets接口，只定义了火车站类（真实类），显示JDK动态代理无法使用，因为JDK动态代理必须定义接口，并对接口进行处理。
CGLIB是对JDK动态代理的补充，解决没有实现接口的类的代理，是一个三方高性能生成包
**同样是在内存中生成所以也是动态代理**
```aidl
<dependency>
    <groudId>cglib</groundId>
    <artifactId>cglib</artifactId>
    <version>2.2.2</version>
</dependency>
```

#总结
JDK代理VSCGLIB代理
CGLIB不能对声明为final的类或者方法进行代理，因为CGLIB原理是动态生成被代理类的子类
JJDK代理效率高于CGLIB，如果有接口就是用JDK代理，如果没有接口就使用CGLIB代理

动态代理VS静态代理
动态优点：接口中声明的方法都被转移到调用处理器一个集中的方法中处理即（InvocationHandler.invoke），  
这样接口方法数量比较多的话，可以进行灵活处理，不需要像静态代理一样对每一个方法进行中转（即接口中增加一个方法，静态除了实现类需要实现方法外，所有的  
代理类也需要实现方法，增加了代码维护的复杂度，动态代理则不需要）
    
    