#桥接模式  
将抽象和实现分离，用组合关系代替继承关系，降低抽象和实现之间的耦合度。  
 ##优点：  
桥接提高了系统扩展性，在两个纬度的中任意扩展另外一个纬度，都不需要修改原有系统  
实现细节对客户的透明  
##场景：  
    - 一个类中存在两个独立变化的纬度，且两个纬度都需要进行扩展
    - 系统不希望使用继承或者多层次继承导致子类数量爆炸
    - 需要在构建的抽象化角色和具体化角色之间增加灵活度避免在两个层次之间建立静态的继承关系，  
    - ，通过桥接模式可以使他们在抽象层上建立一个关联（聚合）关系。