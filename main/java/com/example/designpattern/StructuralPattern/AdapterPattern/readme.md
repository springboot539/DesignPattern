#适配器模式  
将一个类的接口转换为客户需要的另一个接口
结构 目标Target 适配者Adaptee 适配器Adapter  
**1.定义一个适配器类实现当前系统（Target）的业务接口，同时又继承现有组件库中已经存在的组件（Adaptee）**  
**2.定义一个适配类聚合/组合当前系统，并实现现有组件库中已经存在的组件**  
还有一种是接口适配器模式，如果~~~不希望实现接口中所有的方法，可以创建一个抽象类Adapter实现接口中的方法，只需要继承接口类即可~~~  
场景：  
    - 以前开发的存在满足新系统功能需求的类，但和新系统的接口不同
    - 三方系统组件和我们需求接口定义不同  
JDK源码使用：  
    -Reader(字符流) InputStream(字节流) InputStreamReader(继承Reader实现Reader中抽象的方法，其中调用了StreamReader类对象，即聚合了StreamReader)  
    -StreamReader相当于适配器 StreamReader聚合InputStream并且继承Reader并重写其中的方法

