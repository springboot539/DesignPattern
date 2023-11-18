#状态模式
对于有状态的对象，把复杂度判断逻辑提取到不同的状态对象中，允许状态对象在其内部状态发生变化时改变其行为  
结构：  
    环境（Context）上下文，定义了客户程序需要的接口，维护一个当前状态，并将于状态相关的操作委托给当前状态对象来处理
    抽象状态（State）抽象状态类，定义一个接口，用以封装环境对象中的特定状态所对应的行为，可以有一个或多个行为。
    具体状态（ConcreteState）具体状态类，实现抽象状态类中的接口，并且通过接口的实现来定义当前状态对象的行为  

##优点： 
将所有于某个状态有关的代码都封装进一个类中，可以方便地增加新的状态，只需要改变对象状态即可改变对象的行为  
允许状态转换逻辑和状态对象合成一体，而不是巨大的条件语句块  

缺点：  
必然增加系统类和对象的个数  
结构和实现均较为复杂，如果使用不当将导致程序代码和结构胡乱  
对于开闭原则不友好  

场景：  
当一个对象的行为取决于他的状态，并且他必须在运行时根据状态改变他的行为时使用  
一个操作中包含庞大的分支结构，并且这些分支取决于对象的状态时