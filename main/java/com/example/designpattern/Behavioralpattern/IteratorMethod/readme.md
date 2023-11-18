#迭代器模式  
    提供一个对象来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示  
结构：  
    抽象聚合（Aggregate）定义存储、添加、删除聚合元素以及创建迭代器对象的接口  
    具体聚合（ConcreteAggreagte)实现抽象聚合，返回一个具体的迭代器的实例    
    - 抽象迭代器（Iterator）定义访问和聚合元素接口，通常包含hasNext\next方法   
    - 具体迭代器（ConcreteIterator）实现抽象中的方法，完成对聚合对象的遍历，记录遍历的当前位置  


##优点：  
    支持以不同的方式遍历一个集合对象，在同一个聚合对象上可以定义多种遍历方式。 简化了聚合类，原有的聚合对象  
不需要进行修改。 增加新的聚合类和迭代器类都很方便。  
##缺点  
    增加了类的个数，增加了系统的复杂度  

场景：  
    当需要为聚合对象提供多种遍历方式时  
    但需要为遍历不同的聚合结构提供一个统一的接口时  
    当访问一个聚合对象的内容而无须暴露其内部细节的表示时  

##JDK源码  
List： 抽象聚合类 ArrayList具体的聚合类 Iterator 抽象迭代器  list.Iterator返回的时Iterator具体的迭代器对象（一个私有的成员内部类）    