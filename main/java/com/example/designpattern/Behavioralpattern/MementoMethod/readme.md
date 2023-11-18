#备忘录模式  
    状态恢复的实现机制，使得用户可以方便地回到一个特定的历史步骤，当新的状态无效或者存在问题时，可以使用暂时存储起来的备忘录将状态恢复，  
    类似与Undo操作，浏览器后退操作，数据库事务管理中的回滚操作/玩游戏的存档等。  
又叫快照模式，在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样以后就可以将该对象恢复到原先保存的状态。  

结构：  
    发起人（Originator）记录当前时刻的内部状态信息，提供创建备忘录和恢复备忘录功能，实现其他业务功能，它可以访问备忘录里所有内容  
    备忘录（Memento）负责存储发起人的内部状态，在需要的时候提供内容给发起人  
    管理者（Caretaker）备忘录管理，提供保存与获取备忘录的功能，但其不能对备忘录的内容进行访问与修改  

白箱备忘录 和 黑箱备忘录  
备忘录其实就是创建一个属性相同的类，保存一份出来，然后创建一个管理者用来管理这个新创建出来的不同名的类  
白箱可能导致除了发起人之外，管理者也可以直接访问备忘录里面的内容。  
黑箱就是定义一个接口，然后将子类放在发起者内部作为私有类，这样管理者就无法访问备忘录的内容了。 管理者直接面向接口进行使用，具体内部的数据是无法访问到的  


优点：  
    提供一只恢复状态的机制，可以不止一个，比如用一个列表保存多个状态  
缺点：  
    资源消耗大，如果保存的内部状态信息过多或者特别繁琐，将会占用比较大的内存资源  

场景：  
    需要保存与恢复数据的场景   
    需要提供一个可回滚操作的场景  