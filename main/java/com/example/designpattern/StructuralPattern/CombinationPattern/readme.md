#组合模式  
又叫整体部份模式，把一组相似的对象当作一个单一的对象，根据树形结构组合对象，用来表示部份和整体层次。  
结构：  
-抽象根节点：定义系统各个层次对象的共有的方法和属性  
-树枝节点：定义树枝节点，存储子节点
 -叶子节点：系统层次遍历最小单位  
类似于问系统中的文件目录 ，文件夹，文件的树形结构  
##组合模式分类： 根据额抽象构建类的定义形式分为透明组合模式和安全组合模式两种  
 - 透明模式：抽象根节点声明了所有用于管理成员对象的方法，比如MenuComponent中的add和remove getChild方法，好处是确保所有构建类都有相同的接口，是标准的组合模式  
  缺点是不够安全，比如菜单项（树枝节点）才有具有的方法，为叶子节点提供了add等方法没有意义的
 - 安全模式：抽象根节点没有声明任何用于管理成员对象的方法，只有树枝节点声明并实现这些方法，缺点是不够透明，因为叶子和树枝节点有不同的方法，客户端不能完全针对抽象编程，必须有区别的对待叶子和树枝节点，即使用对应的方法（不能多态用父类直接调用具体子类）。  

###优点  
 - 清晰定义分层的复杂对象，表示对象的全部或者部分层次，可以一致的使用组合结构或者当个对象，简化客户端代码，符合开闭原则
 - **组合结构为树形结构的面向对象实现提供方案，通过叶子节点和树枝节点的递归，实现复杂的树形结构但是对树形结构的控制却非常简单**

###场景：  
 - 对应树形结构应运而生，比如文件目录，文件夹，文件，菜单，树形菜单，树形文件目录，树形文件夹，树形文件等