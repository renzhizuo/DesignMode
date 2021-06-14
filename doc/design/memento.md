```html
22.7	备忘录模式的注意事项和细节
1)	给用户提供了一种可以恢复状态的机制，可以使用户能够比较方便地回到某个历史的状态
2)	实现了信息的封装，使得用户不需要关心状态的保存细节
3)	如果类的成员变量过多，势必会占用比较大的资源，而且每一次保存都会消耗一定的内存, 这个需要注意
4)	适用的应用场景：1、后悔药。 2、打游戏时的存档。 3、Windows 里的  ctri + z。  4、IE  中的后退。  4、数据库的事务管理
 
5)	为了节约内存，备忘录模式可以和原型模式配合使用

```
```java
package memento.game;

public class Client {
    public static void main(String[] args) {
        //创建游戏角色
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);
        System.out.println("大战前的状态");
        gameRole.display();

        //吧当前状态保存到caretaker
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("和boss大战");
        gameRole.setDef(30);
        gameRole.setVit(30);
        gameRole.display();

        System.out.println("大战后使用备忘录对象恢复到大战前");
        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
        System.out.println("恢复后。。。。");
        gameRole.display();
    }
}



```
![原理图](image/memento_1.png)
![原理图](image/memento_2.png)