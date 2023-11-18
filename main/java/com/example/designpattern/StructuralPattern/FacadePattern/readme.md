#外观模式  
    **为多个复杂子系统提供一个一致的接口，使子系统更容易呗访问的模式，该模式对外有统一接口，外部应用不需要关心内部子系统的实现细节* *
    **降低应用复杂程度，提供可维护性，是迪米特法则的典型应用**

优点：  
降低子系统与客户端的耦合度，是得子系统的变化不会影响调用它的客户端  
屏蔽子系统组件，使子系统更容易使用  
缺点：  
不符合开闭原则，修改起来很麻烦  

##JDK源码
    - tomcat作为Web容器时，接受浏览器发送过来的请求，tomcat会将请求信息封装为ServeltRequest对象,  
    serveltRequest接口的子接口是HttpServletRequest，HttpServeltRequst有两个子类，Request和RequestFacade
    其中 RequestFacade就是外观模式，它继承子ServeltRequest(HttpServeltRequest)并聚合了Request对象，方法实际调用的是  
    request对象的方法。。将RequestFacade上转为ServletRequest传给Servlet的service方法，    
    **这样即使在servlet中下转为RequestFacade也不能范围私有成员变量对象中的方法，即 又访问了Request对象的方法 又防止其中的方法被不合理的使用**