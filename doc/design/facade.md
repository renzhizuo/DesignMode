```java
package facade;

//外观模式
public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
        homeTheaterFacade.pause();
        homeTheaterFacade.end();
    }
}



```
![原理图](image/facade_1.png)
![原理图](image/facade_2.png)
![原理图](image/facade_3.png)