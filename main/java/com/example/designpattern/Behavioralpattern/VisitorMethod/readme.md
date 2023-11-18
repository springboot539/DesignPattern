# 访问者模式

    定义： 封装一些作用于某种数据结构中各元素的操作，他可以在不改变这个数据结构的前提下定义作用于这些元素的新的操作  

结构：  
抽象访问者（Visitor）定义了对每一个Element访问的行为，它的参数就是与它对应的Element，所以访问者模式要求元素类的个数不能改变。  
具体访问者：实现了每个由抽象访问者声明的操作。 抽象元素（Element）定义了每一个接受访问者（Visitor）的方法，即每一个元素都需要可以被访问者访问。  
具体元素对象： 通常使用访问者提供的访问该元素类的方法  
对象结构角色（Object Structure）是一个抽象表述，可以理解为具有容器性质或者符合对象特性的类，包含一组元素Element，并且可以迭代这些元素，供访问者访问。

例子： 喂食宠物 访问者角色： 给宠物喂食的人  
具体访问者： 主人或者其他人  
抽象元素角色： 动物抽象类  
具体元素角色： 宠物狗/宠物猫  
结构对象角色：主人家  
理解： 就是将主人和喂食的动作绑定，利用主人家Home这个中介，Home有聚合存储所有的动物，提供添加等操作，对于动物的喂养提供一个方法，需要传入  
一个Person主人对象，传入之后遍历每一个宠物Animal的accept方法，在不同的狗和猫的重写的accept方法中，可以直接调用主人对应的feed(cat)、feed(dot)  
的方法，也就是每一个元素类都需要在Person中有一个接口用于调用。最终实现的效果就是将所有的通过Home将所有动物放到一起，直接一个接口，就会使对应的Person执行  
集合中全部宠物的喂养的方法。很绕。

##优点：  
扩展性好：不修改对象结构中的元素，为对象结构中的元素添加新功能  
复用性好： 通过访问者定义整个对象结构通用的功能，提高复用性  
分离无关行为： 吧相关行为封装在一起，构成一个访问者，这样每个访问者功能都比较单一  

##缺点：  
对象结构变化困难，**每增加一个新的元素类，都需要在访问者中增加具体的相应操作**  违背开闭原则    
违反了依赖倒转原则  访问者依赖具体类，而不是依赖抽象类  

##场景：  
对象结构稳定，操作算法经常变化或者需要提供多种不同的不相关的操作，同时又避免让这些操作变化影响对象的结构。


##扩展 访问者模式使用了分派技术  
分派 Map map = new HashMap<>(); map变量的静态类型是Map 实际类型是HashMap。根据对象的类型选择方法，可就是分派（dispatch）  
分配分为静态分派和动态分派  
静态分派：编译期间，比如方法重载就是静态分派。（重载多个同名的方法参数类型个数不同）  
    重载的方法如果传入类型是父类还有子类，则实际执行只会执行参数是父类的方法，子类自动识别为父类执行（静态类型编译期间就分派完了）
动态分派：运行期间，动态置换掉某个方法，Java通过方法的重写支持动态分派。 （多态 运行执行的是子类的方法）  
        
双分派： 
选择一个方法的时候，不仅根据消息接受者（Receiver）的运行时区别，还根据参数的运行时区别  
```
public class Animal{
    public void accept(Execute exe){exe.execute(this);}}

public class Dog extends Animal{
    public void accept(Execute exe){exe.execute(this);}}  

public class Cat extends Animal{
    public void accept(Execute exe){exe.execute(this);}}  

public class Execute{
    public void execute(Animal a){sout(a)}
    public void execute(Cat c){sout(c)}
    public void execute(Dog d){sout(d)}
 
}

psvm{
    Animal a = new Animal();
    Dog d = new Dog();
    Cat c = new Cat();
    
    Execute e = new Execute();
    a.accept(e);
    d.accept(e);
    c.accept(e);
    
}

out: 输出 a d c 而不是 a a a 
如果是静态分派

    public class Animal{}
    public class Dog extends Animal{}
    public class Cat extends Animal{}
    public class Execute{
        public void execute(Animal a){sout(a)}
        public void execute(Cat c){sout(c)}
        public void execute(Dog d){sout(d)}
    }
    
    psvm{
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();
        
        Execute e = new Execute();
        a.accept(e);
        d.accept(e);
    }
    
out : 都是a  重载的方法只执行了 参数是Animal的方法。足以见得和双分派的区别。  
```

访问者模式就是双分派机制，客户端将Execute对象作为参数传入Animal类型的变量调用，完成第一次分配  
这里是方法重写，动态分派的，所以执行实际类型中的方法，同时也将自己作为this传递进去，  
这里的Execute类有多个重载的方法，而传递的是this，就是具体的实际类型的对象

真巧妙呀 所以可以实现方法的动态绑定

双分派本质：在重载方法委派的前面加上继承体系中覆盖的环节，由于覆盖是动态的，所以重载就是动态的啦。