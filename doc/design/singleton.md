```java
package com.renzhi.demo.design.observer;

/**
 * Description : 类描述
 * Created on : 2021-06-13
 * author : renzhi.zuo
 */

public enum SubjectEnum {

    INSTANCE;

    private Subject subject;

    private SubjectEnum() {
        this.subject = new Subject();
    }

    public Subject getInstance() {
        return subject;
    }

    public static void main(String[] args) {
        Subject instance = SubjectEnum.INSTANCE.getInstance();
        Subject instance2 = SubjectEnum.INSTANCE.getInstance();
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
        System.out.println(instance==instance2);
        System.out.println(instance.equals(instance2));
    }
}



```